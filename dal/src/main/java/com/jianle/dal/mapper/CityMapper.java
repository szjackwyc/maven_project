package com.jianle.dal.mapper;

import com.jianle.dal.model.City;
import com.jianle.dal.model.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    int countByExample(CityExample example);

    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExampleWithBLOBs(CityExample example);

    List<City> selectByExample(CityExample example);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExampleWithBLOBs(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);
}