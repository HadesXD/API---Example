package org.example.functions.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "devices", schema = "portal", catalog = "")
public class DevicesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "device_id")
    private String deviceId;
    @Basic
    @Column(name = "device_type")
    private String deviceType;
    @Basic
    @Column(name = "serial")
    private String serial;
    @Basic
    @Column(name = "production_time")
    private Timestamp productionTime;
    @Basic
    @Column(name = "hardware_id")
    private Integer hardwareId;
    @Basic
    @Column(name = "pool_id")
    private Integer poolId;
    @Basic
    @Column(name = "fab_id")
    private Integer fabId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "version")
    private String version;
    @Basic
    @Column(name = "build")
    private String build;
    @Basic
    @Column(name = "appliance_build")
    private String applianceBuild;
    @Basic
    @Column(name = "kernel_version")
    private String kernelVersion;
    @Basic
    @Column(name = "ubuntu_version")
    private String ubuntuVersion;
    @Basic
    @Column(name = "bios_version")
    private String biosVersion;
    @Basic
    @Column(name = "system_serial")
    private String systemSerial;
    @Basic
    @Column(name = "claim_id")
    private String claimId;
    @Basic
    @Column(name = "part_number")
    private String partNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Timestamp getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(Timestamp productionTime) {
        this.productionTime = productionTime;
    }

    public Integer getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(Integer hardwareId) {
        this.hardwareId = hardwareId;
    }

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public Integer getFabId() {
        return fabId;
    }

    public void setFabId(Integer fabId) {
        this.fabId = fabId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getApplianceBuild() {
        return applianceBuild;
    }

    public void setApplianceBuild(String applianceBuild) {
        this.applianceBuild = applianceBuild;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public String getUbuntuVersion() {
        return ubuntuVersion;
    }

    public void setUbuntuVersion(String ubuntuVersion) {
        this.ubuntuVersion = ubuntuVersion;
    }

    public String getBiosVersion() {
        return biosVersion;
    }

    public void setBiosVersion(String biosVersion) {
        this.biosVersion = biosVersion;
    }

    public String getSystemSerial() {
        return systemSerial;
    }

    public void setSystemSerial(String systemSerial) {
        this.systemSerial = systemSerial;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DevicesEntity that = (DevicesEntity) o;

        if (id != that.id) return false;
        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (deviceType != null ? !deviceType.equals(that.deviceType) : that.deviceType != null) return false;
        if (serial != null ? !serial.equals(that.serial) : that.serial != null) return false;
        if (productionTime != null ? !productionTime.equals(that.productionTime) : that.productionTime != null)
            return false;
        if (hardwareId != null ? !hardwareId.equals(that.hardwareId) : that.hardwareId != null) return false;
        if (poolId != null ? !poolId.equals(that.poolId) : that.poolId != null) return false;
        if (fabId != null ? !fabId.equals(that.fabId) : that.fabId != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;
        if (build != null ? !build.equals(that.build) : that.build != null) return false;
        if (applianceBuild != null ? !applianceBuild.equals(that.applianceBuild) : that.applianceBuild != null)
            return false;
        if (kernelVersion != null ? !kernelVersion.equals(that.kernelVersion) : that.kernelVersion != null)
            return false;
        if (ubuntuVersion != null ? !ubuntuVersion.equals(that.ubuntuVersion) : that.ubuntuVersion != null)
            return false;
        if (biosVersion != null ? !biosVersion.equals(that.biosVersion) : that.biosVersion != null) return false;
        if (systemSerial != null ? !systemSerial.equals(that.systemSerial) : that.systemSerial != null) return false;
        if (claimId != null ? !claimId.equals(that.claimId) : that.claimId != null) return false;
        if (partNumber != null ? !partNumber.equals(that.partNumber) : that.partNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (deviceId != null ? deviceId.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (productionTime != null ? productionTime.hashCode() : 0);
        result = 31 * result + (hardwareId != null ? hardwareId.hashCode() : 0);
        result = 31 * result + (poolId != null ? poolId.hashCode() : 0);
        result = 31 * result + (fabId != null ? fabId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (build != null ? build.hashCode() : 0);
        result = 31 * result + (applianceBuild != null ? applianceBuild.hashCode() : 0);
        result = 31 * result + (kernelVersion != null ? kernelVersion.hashCode() : 0);
        result = 31 * result + (ubuntuVersion != null ? ubuntuVersion.hashCode() : 0);
        result = 31 * result + (biosVersion != null ? biosVersion.hashCode() : 0);
        result = 31 * result + (systemSerial != null ? systemSerial.hashCode() : 0);
        result = 31 * result + (claimId != null ? claimId.hashCode() : 0);
        result = 31 * result + (partNumber != null ? partNumber.hashCode() : 0);
        return result;
    }
}
