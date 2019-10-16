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

    fun add(user: User) {
        // TODO:
    }

    fun delete(userId: Int) {
        // TODO:
    }

    fun modify(userId: Int, name: Any, age: Any, email: Any) {
        // TODO:
    }

}