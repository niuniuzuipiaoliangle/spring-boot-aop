package com.aop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aop.annotation.PermissionAnnotation;
import org.springframework.web.bind.annotation.*;

/**
 * @author guozhengMu
 * @version 1.0
 * @createTime 2020/10/16 11:38
 * @description
 */

@RestController
@RequestMapping(value = "/permission")
public class PermissionController {

    @RequestMapping(value = "/check")
//    @PermissionAnnotation()
    public JSONObject getGroupList(@RequestBody JSONObject request) {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }
}
