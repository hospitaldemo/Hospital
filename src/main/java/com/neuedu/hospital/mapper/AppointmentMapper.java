package com.neuedu.hospital.mapper;

import com.neuedu.hospital.pojo.Appointment;
import com.neuedu.hospital.pojo.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppointmentMapper {
    int countByExample(AppointmentExample example);

    int deleteByExample(AppointmentExample example);

    int deleteByPrimaryKey(Integer appointmentId);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    List<Appointment> selectByExample(AppointmentExample example);

    Appointment selectByPrimaryKey(Integer appointmentId);

    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);
}