package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Datadictionary;
import com.neuedu.hospital.pojo.DatadictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatadictionaryMapper {
    int countByExample(DatadictionaryExample example);

    int deleteByExample(DatadictionaryExample example);

    int deleteByPrimaryKey(Integer datadictionaryId);

    int insert(Datadictionary record);

    int insertSelective(Datadictionary record);

    List<Datadictionary> selectByExample(DatadictionaryExample example);

    Datadictionary selectByPrimaryKey(Integer datadictionaryId);

    int updateByExampleSelective(@Param("record") Datadictionary record, @Param("example") DatadictionaryExample example);

    int updateByExample(@Param("record") Datadictionary record, @Param("example") DatadictionaryExample example);

    int updateByPrimaryKeySelective(Datadictionary record);

    int updateByPrimaryKey(Datadictionary record);
}