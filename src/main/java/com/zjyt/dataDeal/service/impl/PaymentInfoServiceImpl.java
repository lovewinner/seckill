package com.zjyt.dataDeal.service.impl;

import com.zjyt.dataDeal.dao.PaymentInfoDao;
import com.zjyt.dataDeal.entity.PaymentInfo;
import com.zjyt.dataDeal.service.PaymentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentInfoServiceImpl implements PaymentInfoService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PaymentInfoDao paymentInfoDao;

    public List<PaymentInfo> queryAll() {
        paymentInfoDao.queryAll(1,4);
        return null;
    }
}
