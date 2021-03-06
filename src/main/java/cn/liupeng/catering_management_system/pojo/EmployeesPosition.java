package cn.liupeng.catering_management_system.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "员工职位")
public class EmployeesPosition {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeesPositionTable.positionID
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "职位ID")
    private Integer positionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeesPositionTable.positionName
     *
     * @mbggenerated
     */
    @ApiModelProperty("职位名称")
    private String positionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeesPositionTable.positionDescription
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "职位说明")
    private String positiondescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employeesPositionTable.salary
     *
     * @mbggenerated
     */
    @ApiModelProperty(value = "薪水")
    private Double salary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeesPositionTable.positionID
     *
     * @return the value of employeesPositionTable.positionID
     *
     * @mbggenerated
     */
    public Integer getPositionid() {
        return positionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeesPositionTable.positionID
     *
     * @param positionid the value for employeesPositionTable.positionID
     *
     * @mbggenerated
     */
    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeesPositionTable.positionName
     *
     * @return the value of employeesPositionTable.positionName
     *
     * @mbggenerated
     */
    public String getPositionname() {
        return positionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeesPositionTable.positionName
     *
     * @param positionname the value for employeesPositionTable.positionName
     *
     * @mbggenerated
     */
    public void setPositionname(String positionname) {
        this.positionname = positionname == null ? null : positionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeesPositionTable.positionDescription
     *
     * @return the value of employeesPositionTable.positionDescription
     *
     * @mbggenerated
     */
    public String getPositiondescription() {
        return positiondescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeesPositionTable.positionDescription
     *
     * @param positiondescription the value for employeesPositionTable.positionDescription
     *
     * @mbggenerated
     */
    public void setPositiondescription(String positiondescription) {
        this.positiondescription = positiondescription == null ? null : positiondescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employeesPositionTable.salary
     *
     * @return the value of employeesPositionTable.salary
     *
     * @mbggenerated
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employeesPositionTable.salary
     *
     * @param salary the value for employeesPositionTable.salary
     *
     * @mbggenerated
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeesPosition{" +
                "positionid=" + positionid +
                ", positionname='" + positionname + '\'' +
                ", positiondescription='" + positiondescription + '\'' +
                ", salary=" + salary +
                '}';
    }
}