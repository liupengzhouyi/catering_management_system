package cn.liupeng.catering_management_system.pojo;

public class Employees {
    private Integer employeesid;

    private String employeesname;

    private String employeesphonenumber;

    private String employeespasswordvalue;

    private String employeesregistereddate;

    private String employeesregisteredtime;

    private Integer iscancellation;

    private String employeescancellationdate;

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