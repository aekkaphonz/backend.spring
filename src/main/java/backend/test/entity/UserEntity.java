package backend.test.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import jakarta.persistence.*;
@Entity
@Table(name = "sso_user_test")

public class UserEntity {

    @Id
    @Column(name = "request_date")
    private Timestamp requestDate;

    @JsonProperty("ssoType")
    @Column(name = "ssotype")
    private String ssotype;

    @JsonProperty("systemId")
    @Column(name = "systemid")
    private String systemid;

    @JsonProperty("systemName")
    @Column(name = "systemname")
    private String systemname;

    @JsonProperty("systemTransactions")
    @Column(name = "systemtransactions")
    private String systemtransactions;

    @JsonProperty("systemPrivileges")
    @Column(name = "systemprivileges")
    private String systemprivileges;

    @JsonProperty("systemUserGroup")
    @Column(name = "systemusergroup")
    private String systemusergroup;

    @JsonProperty("systemLocationGroup")
    @Column(name = "systemlocationgroup")
    private String systemlocationgroup;

    @JsonProperty("userId")
    @Column(name = "userid")
    private String userid;

    @JsonProperty("userFullName")
    @Column(name = "userfullname")
    private String userfullname;

    @JsonProperty("userRdOfficeCode")
    @Column(name = "userrdofficecode")
    private String userrdofficecode;

    @JsonProperty("userOfficeCode")
    @Column(name = "userofficecode")
    private String userofficecode;

    @JsonProperty("clientLocation")
    @Column(name = "clientlocation")
    private String clientlocation;

    @JsonProperty("locationMachineNumber")
    @Column(name = "locationmachinenumber")
    private String locationmachinenumber;

    @JsonProperty("tokenId")
    @Column(name = "tokenid")
    private String tokenid;


    public java.sql.Timestamp getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(java.sql.Timestamp requestDate) {
        this.requestDate = requestDate;
    }

    public String getSsotype() {
        return ssotype;
    }

    public void setSsotype(String ssotype) {
        this.ssotype = ssotype;
    }

    public String getSystemid() {
        return systemid;
    }

    public void setSystemid(String systemid) {
        this.systemid = systemid;
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname;
    }

    public String getSystemtransactions() {
        return systemtransactions;
    }

    public void setSystemtransactions(String systemtransactions) {
        this.systemtransactions = systemtransactions;
    }

    public String getSystemprivileges() {
        return systemprivileges;
    }

    public void setSystemprivileges(String systemprivileges) {
        this.systemprivileges = systemprivileges;
    }

    public String getSystemusergroup() {
        return systemusergroup;
    }

    public void setSystemusergroup(String systemusergroup) {
        this.systemusergroup = systemusergroup;
    }

    public String getSystemlocationgroup() {
        return systemlocationgroup;
    }

    public void setSystemlocationgroup(String systemlocationgroup) {
        this.systemlocationgroup = systemlocationgroup;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserfullname() {
        return userfullname;
    }

    public void setUserfullname(String userfullname) {
        this.userfullname = userfullname;
    }

    public String getUserrdofficecode() {
        return userrdofficecode;
    }

    public void setUserrdofficecode(String userrdofficecode) {
        this.userrdofficecode = userrdofficecode;
    }

    public String getUserofficecode() {
        return userofficecode;
    }

    public void setUserofficecode(String userofficecode) {
        this.userofficecode = userofficecode;
    }

    public String getClientlocation() {
        return clientlocation;
    }

    public void setClientlocation(String clientlocation) {
        this.clientlocation = clientlocation;
    }

    public String getLocationmachinenumber() {
        return locationmachinenumber;
    }

    public void setLocationmachinenumber(String locationmachinenumber) {
        this.locationmachinenumber = locationmachinenumber;
    }

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }
}
