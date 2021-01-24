package com.dentalportal.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "patient_rxdt")
public class PatientRxdt {

    @Id
    private BigDecimal id;
    private BigDecimal pid;
    private BigDecimal cid;
    private String rxdt;
    private String notes;
    private BigDecimal estimate;
    private BigDecimal paid;
    private BigDecimal caseid;
    private String status;
    private String toothids;
    private Timestamp date;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public String getRxdt() {
        return rxdt;
    }

    public void setRxdt(String rxdt) {
        this.rxdt = rxdt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public BigDecimal getEstimate() {
        return estimate;
    }

    public void setEstimate(BigDecimal estimate) {
        this.estimate = estimate;
    }

    public BigDecimal getPaid() {
        return paid;
    }

    public void setPaid(BigDecimal paid) {
        this.paid = paid;
    }

    public BigDecimal getCaseid() {
        return caseid;
    }

    public void setCaseid(BigDecimal caseid) {
        this.caseid = caseid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToothids() {
        return toothids;
    }

    public void setToothids(String toothids) {
        this.toothids = toothids;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }




}
