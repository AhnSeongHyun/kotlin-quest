package com.ash84.app.Controller


import com.ash84.app.Entity.AppInfo
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class RootController {
    @GetMapping("/")
    fun index() : AppInfo { return AppInfo("app", "1.0.0")
    }
}