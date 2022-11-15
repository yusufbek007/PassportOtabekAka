package com.example.passportotabekaka.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.passportotabekaka.models.User


@Dao
interface MyDao {



    @Insert
    fun addUser(user: User)

    @Query("select * from my_passport")
    fun getAllUser():List<User>


}