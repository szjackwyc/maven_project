package com.jianle.dal.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class BackstageOperLog {
    private Long id;

    private String userNo;

    private String operDesc;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc;
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }
}
