package com.jianle.service;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jianle.dal.model.BackstageOperLog;

public class BackstageOperLogTest extends BaseTestCase {

    @Autowired
    private BackstageOperLogService backstageOperLogService;

    @Test
    public void insert() {
        System.out.println("--start test--");
        BackstageOperLog record = new BackstageOperLog();
        record.setUserNo("00248548");
        record.setOperDesc("用户登录！");
        record.setOperTime(new Date());
        int ret = backstageOperLogService.insert(record);
        System.out.println(ret);
    }
}
