package com.zjyt.taget.dao;

import com.zjyt.dataDeal.entity.PaymentInfo;
import com.zjyt.taget.entity.OldPayinfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lovewinner on 2017/7/6 0006.
 */
public interface OldPayinfoDao {
    List<OldPayinfo> queryAll();
    List<OldPayinfo> queryPage(@Param("offset")int offset, @Param("limit")int limit);
}
