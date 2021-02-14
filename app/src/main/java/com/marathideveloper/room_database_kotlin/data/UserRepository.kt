package com.marathideveloper.room_database_kotlin.data

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData :LiveData<List<User>> = userDao.readAllData()

    suspend fun  addUser(user: User){
        userDao.addUser(user)
    }
}