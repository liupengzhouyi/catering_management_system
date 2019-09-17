package cn.liupeng.catering_management_system.pojo;

public class EmployeesLogin {
    private Integer employeesloginid;

    private String employeesid;

    private String logindatetime;

    private String ipaddress;

    private Double longitude;

    private Double latitude;

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
}