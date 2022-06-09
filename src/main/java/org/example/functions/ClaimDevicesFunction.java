package org.example.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.example.functions.model.jsonDevice;

import java.sql.*;
import java.util.*;

/**
 * Azure Functions for Claim Devices API
 **/

// TODO: better error handling
// TODO: make claim id optional

public class ClaimDevicesFunction {

    @FunctionName("ClaimDevices")
    public HttpResponseMessage run(
            @HttpTrigger(name = "req",
                    methods = {HttpMethod.GET},
                    authLevel = AuthorizationLevel.ANONYMOUS,
                    route = "claim/devices/{device-type:alpha}/{device-id:long}/{claim-id}")
                    HttpRequestMessage<Optional<String>> request,
            @BindingName("device-type") String deviceType, // Example: coreappliance
            @BindingName("device-id") long deviceId, // Example: 50051
            @BindingName("claim-id") String claimId, // Example: 04CAB001302-G220000001
            final ExecutionContext context)
    {
        context.getLogger().info("DeviceType: " + deviceType + ", " +
                "DeviceId: " + deviceId + "ClaimId: " + claimId);

        try
        {
            Class.forName("com.mysql.jdbc.Driver"); // Required for jdbc
            // Data from local.settings.json
            String connectionUrl = System.getenv("SqlConnectionString");
            String user = System.getenv("SqlUser");
            String pass = System.getenv("SqlPassword");

            java.sql.Connection connect = DriverManager.getConnection(connectionUrl, user, pass);

            final String query = "SELECT * FROM devices WHERE device_type = ? AND device_id = ? AND claim_id = ?";
            final PreparedStatement preparedStatement = connect.prepareStatement(query);

            preparedStatement.setString(1, deviceType);
            preparedStatement.setLong(2, deviceId);
            preparedStatement.setString(3, claimId);

            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                //List<String> gpas = new ArrayList<>();
                jsonDevice mainValue = new jsonDevice();
                Map<String, Object> map = new HashMap<String, Object>();

                if (!resultSet.next()) {
                    return request.createResponseBuilder(HttpStatus.BAD_REQUEST)
                            .body("Please pass different values!").build();
                }
                else {
                    mainValue.setDevice_id(resultSet.getInt(2));
                    mainValue.setDevice_type(resultSet.getString(3));
                    mainValue.setSerial(resultSet.getString(4));
                    mainValue.setClaim_id(resultSet.getString(18));
                }

                map.put("device", mainValue);
                connect.close();

                if (mainValue == null) {
                    return request.createResponseBuilder(HttpStatus.BAD_REQUEST).
                            body("Please pass a value in the query.").build();
                } else {
                    return request.createResponseBuilder(HttpStatus.OK).body(map).
                            header("Content-Type", "application/json").build();
                }
            }

        } catch (Exception ex)
        {
            System.out.println("The error: " + ex);
        }
        return request.createResponseBuilder(HttpStatus.BAD_REQUEST).
                body("Please pass a correct value.").build();
    }
}
