package com.jianle.dal.mapper;

import com.jianle.dal.model.BackstageOperLog;
import com.jianle.dal.model.BackstageOperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackstageOperLogMapper {
    int countByExample(BackstageOperLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BackstageOperLog record);

    int insertSelective(BackstageOperLog record);

    List<BackstageOperLog> selectByExample(BackstageOperLogExample example);

    BackstageOperLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BackstageOperLog record, @Param("example") BackstageOperLogExample example);

    int updateByExample(@Param("record") BackstageOperLog record, @Param("example") BackstageOperLogExample example);

    int updateByPrimaryKeySelective(BackstageOperLog record);

    int updateByPrimaryKey(BackstageOperLog record);
}