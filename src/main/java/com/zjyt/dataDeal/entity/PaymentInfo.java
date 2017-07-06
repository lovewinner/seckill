package com.zjyt.dataDeal.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import java.io.Serializable;
import java.util.Date;


public class PaymentInfo implements Serializable{

    private String id;
    private String htnum;
    private double bkmoney;
    private Date bktime;
    private int bkcs;
    private String fksm;
    private String skunit;

    public PaymentInfo() {

    }

    public PaymentInfo(String id, String htnum, double bkmoney, Date bktime, int bkcs, String fksm, String skunit) {

        this.id = id;
        this.htnum = htnum;
        this.bkmoney = bkmoney;
        this.bktime = bktime;
        this.bkcs = bkcs;
        this.fksm = fksm;
        this.skunit = skunit;
    }

    @Override
    public String toString() {
       return ToStringBuilder.reflectionToString(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHtnum() {
        return htnum;
    }

    public void setHtnum(String htnum) {
        this.htnum = htnum;
    }

    public double getBkmoney() {
        return bkmoney;
    }

    public void setBkmoney(double bkmoney) {
        this.bkmoney = bkmoney;
    }

    public Date getBktime() {
        return bktime;
    }

    public void setBktime(Date bktime) {
        this.bktime = bktime;
    }

    public int getBkcs() {
        return bkcs;
    }

    public void setBkcs(int bkcs) {
        this.bkcs = bkcs;
    }

    public String getFksm() {
        return fksm;
    }

    public void setFksm(String fksm) {
        this.fksm = fksm;
    }

    public String getSkunit() {
        return skunit;
    }

    public void setSkunit(String skunit) {
        this.skunit = skunit;
    }


}
