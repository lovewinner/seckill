package com.zjyt.dataDeal.dao;

import com.zjyt.dataDeal.entity.PaymentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PaymentInfoDao {

    List<PaymentInfo> queryAll();
    List<PaymentInfo> queryPage(@Param("offset")int offset, @Param("limit")int limit);


}
