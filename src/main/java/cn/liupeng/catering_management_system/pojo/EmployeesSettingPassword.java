package cn.liupeng.catering_management_system.pojo;


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

    public Integer getSettingpasswordid() {
        return settingpasswordid;
    }

    public void setSettingpasswordid(Integer settingpasswordid) {
        this.settingpasswordid = settingpasswordid;
    }

    public String getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(String employeesid) {
        this.employeesid = employeesid == null ? null : employeesid.trim();
    }

    public String getSettingdatetime() {
        return settingdatetime;
    }

    public void setSettingdatetime(String settingdatetime) {
        this.settingdatetime = settingdatetime == null ? null : settingdatetime.trim();
    }

    public String getIpadress() {
        return ipadress;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress == null ? null : ipadress.trim();
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

    public Integer getSettingresults() {
        return settingresults;
    }

    public void setSettingresults(Integer settingresults) {
        this.settingresults = settingresults;
    }
}