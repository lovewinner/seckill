package com.zjyt.taget.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by lovewinner on 2017/7/6 0006.
 */
public class OldPayinfo {
    private Integer id;

    private String htnum;

    private BigDecimal bkmoney;

    private Date bktime;

    private Integer bkcs;

    private String fksm;

    private String skunit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHtnum() {
        return htnum;
    }

    public void setHtnum(String htnum) {
        this.htnum = htnum == null ? null : htnum.trim();
    }

    public BigDecimal getBkmoney() {
        return bkmoney;
    }

    public void setBkmoney(BigDecimal bkmoney) {
        this.bkmoney = bkmoney;
    }

    public Date getBktime() {
        return bktime;
    }

    public void setBktime(Date bktime) {
        this.bktime = bktime;
    }

    public Integer getBkcs() {
        return bkcs;
    }

    public void setBkcs(Integer bkcs) {
        this.bkcs = bkcs;
    }

    public String getFksm() {
        return fksm;
    }

    public void setFksm(String fksm) {
        this.fksm = fksm == null ? null : fksm.trim();
    }

    public String getSkunit() {
        return skunit;
    }

    public void setSkunit(String skunit) {
        this.skunit = skunit == null ? null : skunit.trim();
    }
}
