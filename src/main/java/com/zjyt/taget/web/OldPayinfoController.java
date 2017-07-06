package com.zjyt.taget.web;


import com.zjyt.taget.service.OldPayinfoService;
import com.zjyt.taget.entity.OldPayinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lovewinner on 2017/7/6 0006.
 */
@Controller
@RequestMapping("/oldpayinfo")
@ResponseBody
public class OldPayinfoController {
    @Autowired
    private OldPayinfoService OldPayinfoService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<OldPayinfo> list(ModelMap modelMap) {
        return OldPayinfoService.queryAll();
    }
}


