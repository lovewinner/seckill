package com.zjyt.taget.service;

import com.zjyt.dataDeal.entity.PaymentInfo;
import com.zjyt.taget.entity.OldPayinfo;

import java.util.List;

/**
 * Created by lovewinner on 2017/7/6 0006.
 */
public interface OldPayinfoService {
    List<OldPayinfo> queryAll();
    List<OldPayinfo> queryPage(int offset,int limit);
}
