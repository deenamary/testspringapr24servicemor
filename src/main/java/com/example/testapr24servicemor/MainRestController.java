package com.example.testapr24servicemor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainRestController {

    @Autowired
    String appName;

    @Autowired
    String admin_username;

    @GetMapping("get/app/name")
    public String getAppName( ){
        return appName;
    }

    @GetMapping("get/admin/username")
    public String getAdminUserName( ){
        return admin_username;
    }
}
