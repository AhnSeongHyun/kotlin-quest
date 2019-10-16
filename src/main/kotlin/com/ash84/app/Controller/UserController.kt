package com.ash84.app.Controller


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

    @RequestMapping(method=[RequestMethod.POST])
    fun add(@RequestBody payload:Map<String, Any>) {
        val user = User(payload["name"].toString(),
                payload["age"].toString().toInt(),
                payload["email"].toString())
        this.userService.add(user)
    }

    @RequestMapping(path=["/{userId}"], method=[RequestMethod.DELETE])
    fun delete(@PathVariable("userId") userId: Int) {
        this.userService.delete(userId)
    }

    @RequestMapping(path=["/{userId}"], method=[RequestMethod.POST])
    fun modify(@PathVariable("userId") userId: Int, @RequestBody payload:Map<String, Any>){
        this.userService.modify(userId,
                payload["name"].toString(),
                payload["age"].toString().toInt(),
                payload["email"].toString())
    }
}