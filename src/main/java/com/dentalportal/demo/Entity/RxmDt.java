package com.dentalportal.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "Rxmdt")
public class RxmDt {
    @Id
    private BigDecimal id;
    private BigDecimal rxmid;
    private String details;
    private BigDecimal cid;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getRxmid() {
        return rxmid;
    }

    public void setRxmid(BigDecimal rxmid) {
        this.rxmid = rxmid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }


}
