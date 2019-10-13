package com.ash84.app.Service

import com.ash84.app.Entity.User

class UserService {
    fun get(userId : Int) : User? {
        return User("ash84", 23, "sh84.ahn@gmail.com")
    }
    fun list() = listOf(
            User("ash84", 23, "sh84.ahn@gmail.com"),
            User("ash84", 23, "sh84.ahn@gmail.com")
    )

}