package com.guigu.insmanagement.system.mapper;

import com.guigu.insmanagement.po.StaffInfo;
import com.guigu.insmanagement.po.StaffInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffInfoMapper {
    int countByExample(StaffInfoExample example);

    int deleteByExample(StaffInfoExample example);

    int deleteByPrimaryKey(Integer staffId);

    int insert(StaffInfo record);

    int insertSelective(StaffInfo record);

    List<StaffInfo> selectByExample(StaffInfoExample example);

    StaffInfo selectByPrimaryKey(Integer staffId);

    int updateByExampleSelective(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    int updateByExample(@Param("record") StaffInfo record, @Param("example") StaffInfoExample example);

    int updateByPrimaryKeySelective(StaffInfo record);

    int updateByPrimaryKey(StaffInfo record);
}