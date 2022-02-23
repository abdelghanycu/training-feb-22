package com.sci.week03.test2;

import com.sci.week03.test2.models.Employee;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

  private static SessionFactory factory;

  public static void main(String[] args) {

    try {

      factory = new Configuration().configure().buildSessionFactory();

      System.out.println("Connected database successfully...");

    } catch (Exception ex) {
      System.err.println("Unable to connect to the database with error" + ex.getMessage());
    }

//    System.out.println(addEmployee("abdelghany", "mahmoud", 55));

//    updateEmployee(1542, 99);

//    deleteEmployee(1542);

//    getEmployees();
  }

  public static void getEmployees() {

    try (Session session = factory.openSession()) {

      List<Employee> employees = session.createQuery("FROM Employee").list();

      for (Employee employee : employees) {
        System.out.println(employee);
      }

    } catch (Exception e) {
      System.err.println("DB error: " + e.getMessage());
    }
  }

  public static Integer addEmployee(String fName, String lName, int salary) {
    Transaction tx = null;
    Integer employeeID = null;

    try (Session session = factory.openSession()) {

      tx = session.beginTransaction();

      Employee employee = new Employee();
      employee.setEmployeeId(1542);
      employee.setFirstName(fName);
      employee.setLastName(lName);
      employee.setSalary(salary);
      employee.setHireDate(new Date());
      employee.setEmail("email.com");
      employee.setJobId("AD_PRES");
      employeeID = (Integer) session.save(employee);

      tx.commit();

    } catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      System.err.println("DB error: " + e.getMessage());
    }

    return employeeID;
  }

  public static void updateEmployee(Integer EmployeeID, int salary) {
    Session session = factory.openSession();
    Transaction tx = null;

    try {

      tx = session.beginTransaction();

      Employee employee = (Employee) session.get(Employee.class, EmployeeID);
      employee.setSalary(salary);
      session.update(employee);

      tx.commit();

    } catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      System.err.println("DB error: " + e.getMessage());
    }
  }

  public static void deleteEmployee(Integer EmployeeID) {
    Session session = factory.openSession();
    Transaction tx = null;

    try {
      tx = session.beginTransaction();

      Employee employee = (Employee) session.get(Employee.class, EmployeeID);
      session.delete(employee);

      tx.commit();

    } catch (Exception e) {
      if (tx != null) {
        tx.rollback();
      }
      System.err.println("DB error: " + e.getMessage());
    }
  }
}
