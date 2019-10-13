package com.ash84.app


import com.ash84.app.Entity.User
import com.ash84.app.Service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController {
    val userService = UserService()
    @RequestMapping(method=[RequestMethod.GET])
    fun list(): List<User>? {
        return this.userService.list()
    }
    @RequestMapping(path=["/{userId}"], method=[RequestMethod.GET])
    fun get(@PathVariable("userId") userId: Int): User? {
        return this.userService.get(userId)
    }

//    @RequestMapping(path=["/"], method=[RequestMethod.POST])
//    fun add() {
//
//    }
//    @GetMapping("/")
//    fun remote() {
//
//    }
//    @GetMapping("/")
//    fun modify(){
//
//    }
}