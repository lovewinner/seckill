package com.zjyt.dataDeal.dao;

import com.zjyt.dataDeal.entity.PaymentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface PaymentInfoDao {
    /**
     * 根据偏移量查询秒杀列表
     * @param offset
     * @param limit
     * @return
     */
    List<PaymentInfo> queryAll(@Param("offset")int offset, @Param("limit")int limit);
}
