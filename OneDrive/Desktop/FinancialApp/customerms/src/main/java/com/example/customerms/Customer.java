package com.example.customerms;

import jakarta.persistence.*;
import com.example.customerms.Debit;
import com.example.customerms.CreditInfo;


import java.util.List;

@Entity
@Table(name = "Customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long customerId;
    private String firstName;
    private String lastName;
    private String email;
  //  private List<Credit> creditList;
   // private List<Debit> debitList;
    public Customer() {
    }

    public Customer(long customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
