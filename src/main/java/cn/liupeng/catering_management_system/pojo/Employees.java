package cn.liupeng.catering_management_system.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(value = "员工类")
public class Employees {

    // 员工ID
    @ApiModelProperty(value = "员工ID")
    private Integer employeesid;

    // 员工姓名
    @ApiModelProperty(value = "员工姓名")
    private String employeesname;

    // 员工电话号码
    @ApiModelProperty(value = "员工电话号码")
    private String employeesphonenumber;

    // 员工密码值
    @ApiModelProperty(value = "员工密码值")
    private String employeespasswordvalue;

    // 员工注册日期
    @ApiModelProperty(value = "员工注册日期")
    private String employeesregistereddate;

    // 员工注册时间
    @ApiModelProperty(value = "员工注册时间")
    private String employeesregisteredtime;

    // 是否注销
    @ApiModelProperty(value = "是否注销")
    private Integer iscancellation;

    // 员工注销日期
    @ApiModelProperty(value = "员工注销日期")
    private String employeescancellationdate;

    // 员工注销时间
    @ApiModelProperty(value = "员工注销时间")
    private String employeescancellationtime;

    public Integer getEmployeesid() {
        return employeesid;
    }

    public void setEmployeesid(Integer employeesid) {
        this.employeesid = employeesid;
    }

    public String getEmployeesname() {
        return employeesname;
    }

    public void setEmployeesname(String employeesname) {
        this.employeesname = employeesname == null ? null : employeesname.trim();
    }

    public String getEmployeesphonenumber() {
        return employeesphonenumber;
    }

    public void setEmployeesphonenumber(String employeesphonenumber) {
        this.employeesphonenumber = employeesphonenumber == null ? null : employeesphonenumber.trim();
    }

    public String getEmployeespasswordvalue() {
        return employeespasswordvalue;
    }

    public void setEmployeespasswordvalue(String employeespasswordvalue) {
        this.employeespasswordvalue = employeespasswordvalue == null ? null : employeespasswordvalue.trim();
    }

    public String getEmployeesregistereddate() {
        return employeesregistereddate;
    }

    public void setEmployeesregistereddate(String employeesregistereddate) {
        this.employeesregistereddate = employeesregistereddate == null ? null : employeesregistereddate.trim();
    }

    public String getEmployeesregisteredtime() {
        return employeesregisteredtime;
    }

    public void setEmployeesregisteredtime(String employeesregisteredtime) {
        this.employeesregisteredtime = employeesregisteredtime == null ? null : employeesregisteredtime.trim();
    }

    public Integer getIscancellation() {
        return iscancellation;
    }

    public void setIscancellation(Integer iscancellation) {
        this.iscancellation = iscancellation;
    }

    public String getEmployeescancellationdate() {
        return employeescancellationdate;
    }

    public void setEmployeescancellationdate(String employeescancellationdate) {
        this.employeescancellationdate = employeescancellationdate == null ? null : employeescancellationdate.trim();
    }

    public String getEmployeescancellationtime() {
        return employeescancellationtime;
    }

    public void setEmployeescancellationtime(String employeescancellationtime) {
        this.employeescancellationtime = employeescancellationtime == null ? null : employeescancellationtime.trim();
    }
}