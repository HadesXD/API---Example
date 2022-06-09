package org.example.functions.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonRootName(value = "device")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public class jsonDevice {
    long device_id;
    String device_type;
    String serial;
    String claim_id;

    public jsonDevice() { }

    public long getDevice_id() { return device_id; }
    public void setDevice_id(int device_id) { this.device_id = device_id; }

    public String getDevice_type() { return device_type; }
    public void setDevice_type(String device_type) { this.device_type = device_type; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getClaim_id() { return claim_id; }
    public void setClaim_id(String claim_id) { this.claim_id = claim_id; }
}
