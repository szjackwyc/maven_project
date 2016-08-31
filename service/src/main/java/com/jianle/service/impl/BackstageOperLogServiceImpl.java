package com.jianle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianle.dal.mapper.BackstageOperLogMapper;
import com.jianle.dal.model.BackstageOperLog;
import com.jianle.dal.model.BackstageOperLogExample;
import com.jianle.service.BackstageOperLogService;

@Service("backstageOperLogService")
public class BackstageOperLogServiceImpl implements BackstageOperLogService {

    @Autowired
    private BackstageOperLogMapper backstageOperLogMapper;

    public int insert(BackstageOperLog record) {
        return backstageOperLogMapper.insert(record);
    }

    public List<BackstageOperLog> findAll() {
        return backstageOperLogMapper.selectByExample(new BackstageOperLogExample());
    }

    public int update(BackstageOperLog record) {
        return 0;
    }

}
