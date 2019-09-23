package cn.liupeng.catering_management_system.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "员工登录")
public class EmployeesLogin {
    @ApiModelProperty(value = "员工登录ID")
    private Integer employeesloginid;

    @ApiModelProperty(value = "员工ID")
    private String employeesid;

    @ApiModelProperty(value = "员工登录时间")
    private String logindatetime;

    @ApiModelProperty(value = "登录IP地址")
    private String ipaddress;

    @ApiModelProperty(value = "登录定位经度")
    private Double longitude;

    @ApiModelProperty(value = "登录定位纬度")
    private Double latitude;

    @ApiModelProperty(value = "登录结果")
    private Integer loginresults;

    public Integer getEmployeesloginid() {
        return employeesloginid;
    }

    public void setEmployeesloginid(Integer employeesloginid) {
        this.employeesloginid = employeesloginid;
    }

    public String getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(String employeesid) {
        this.employeesid = employeesid == null ? null : employeesid.trim();
    }

    public String getLogindatetime() {
        return logindatetime;
    }

    public void setLogindatetime(String logindatetime) {
        this.logindatetime = logindatetime == null ? null : logindatetime.trim();
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getLoginresults() {
        return loginresults;
    }

    public void setLoginresults(Integer loginresults) {
        this.loginresults = loginresults;
    }

    @Override
    public String toString() {
        return "EmployeesLogin{" +
                "employeesloginid=" + employeesloginid +
                ", employeesid='" + employeesid + '\'' +
                ", logindatetime='" + logindatetime + '\'' +
                ", ipaddress='" + ipaddress + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", loginresults=" + loginresults +
                '}';
    }
}

/*

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "员工修改密码")
public class EmployeesSettingPassword {

    @ApiModelProperty(value = "修改密码ID")
    private Integer settingpasswordid;

    @ApiModelProperty(value = "员工ID")
    private String employeesid;

    @ApiModelProperty(value = "修改密码日期-时间")
    private String settingdatetime;

    @ApiModelProperty(value = "Ip地址")
    private String ipadress;

    @ApiModelProperty(value = "定位经度")
    private Double longitude;

    @ApiModelProperty(value = "定位纬度")
    private Double latitude;

    @ApiModelProperty(value = "修改结果")
    private Integer settingresults;
 */