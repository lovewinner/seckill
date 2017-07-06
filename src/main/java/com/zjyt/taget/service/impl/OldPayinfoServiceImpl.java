package com.zjyt.taget.service.impl;

import com.zjyt.dataDeal.dao.PaymentInfoDao;
import com.zjyt.dataDeal.entity.PaymentInfo;
import com.zjyt.taget.dao.OldPayinfoDao;
import com.zjyt.taget.entity.OldPayinfo;
import com.zjyt.taget.service.OldPayinfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lovewinner on 2017/7/6 0006.
 */
@Service
public class OldPayinfoServiceImpl implements OldPayinfoService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OldPayinfoDao dao;

    public List<OldPayinfo> queryAll() {
        return dao.queryAll();
    }

    public List<OldPayinfo> queryPage(int offset, int limit) {
        return dao.queryPage(offset,limit);
    }
}
