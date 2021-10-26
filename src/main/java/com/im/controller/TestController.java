package com.im.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Author: I'm
 * Date: 2021/10/20
 */
@RestController
@Api(tags = "测试模块")
@RequestMapping
@RequiredArgsConstructor
public class TestController {

    @ApiOperation("测试customers")
    @GetMapping("/customers")
//    @Secured({ "ROLE_USER"})
    public String customers() {
        return "customers";
    }

    @ApiOperation("测试resource")
    @GetMapping("/resource")
//    @Secured({ "ROLE_USER"})
    public String resource() {
        return "resource";
    }

    @ApiOperation("测试resourceCustomers")
    @GetMapping("/resource/customers")
//    @Secured({ "ROLE_USER"})
    public String resourceCustomers() {
        return "resourceCustomers";
    }

    @ApiOperation("sso/login")
    @GetMapping("/admin/sso")
//    @Secured({ "ROLE_ADMIN"})
    public String ssoLogin() {
        return "ssoLogin";
    }

}
