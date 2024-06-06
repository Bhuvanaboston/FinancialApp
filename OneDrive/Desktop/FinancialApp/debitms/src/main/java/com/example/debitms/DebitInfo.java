package com.example.debitms;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "DebitInfo_table")
public class DebitInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int amount;
    private String description;
    private Date date;
    private String customerName;

    public DebitInfo() {
    }

    public DebitInfo(Long id, int amount, String description, Date date, String customerName) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.date = date;
        this.customerName = customerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "DebitInfo{" +
                "id=" + id +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
