package com.trainingmug.java.oop.features.abstraction;

public abstract class CustomerService {

  abstract void addCustomertoDb(Customer customer);

  void displayCustomerDetails(Customer customer){
    System.out.println("Id : " + customer.id);
    System.out.println("Name : " + customer.name);
    System.out.println("E-mail : " + customer.email);
    System.out.println("Contact No : " + customer.contactNo);
    System.out.println("Salary : " + customer.salary);
    System.out.println("Age : " + customer.age);
  }
}
