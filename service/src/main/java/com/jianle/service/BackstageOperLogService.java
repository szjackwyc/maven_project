package com.jianle.service;

import java.util.List;

import com.jianle.dal.model.BackstageOperLog;

public interface BackstageOperLogService {
    int insert(BackstageOperLog record);

    List<BackstageOperLog> findAll();

    int update(BackstageOperLog record);

}
