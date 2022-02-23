package com.sci.week03.test2.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees", schema = "hr")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

  private static final long serialVersionUID = -915428707036605461L;

  @Id
  @Column(name = "employee_id")
  private Integer employeeId;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "email")
  private String email;
  @Column(name = "phone_number")
  private String phoneNumber;
  @Column(name = "hire_date")
  private Date hireDate;
  @Column(name = "job_id")
  private String jobId;
  @Column(name = "salary")
  private Integer salary;
  @Column(name = "commission_pct")
  private Integer commissionPct;
  @Column(name = "manager_id")
  private Integer managerId;
  @Column(name = "department_id")
  private Integer departmentId;

}
