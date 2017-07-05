package com.zjyt.dataDeal.web;

import com.zjyt.dataDeal.entity.PaymentInfo;
import com.zjyt.dataDeal.service.PaymentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lovewinner on 2017/7/5 0005.
 */
@Controller
@RequestMapping("/paymentInfo")
@ResponseBody
public class PaymentInfoController {
    @Autowired
    private PaymentInfoService paymentInfoService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<PaymentInfo> list(ModelMap modelMap) {
        return paymentInfoService.queryAll();
    }
}
