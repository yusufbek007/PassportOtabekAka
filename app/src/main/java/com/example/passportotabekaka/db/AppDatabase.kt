package com.example.passportotabekaka.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.passportotabekaka.models.User

@Database(entities = [User::class] , version = 1)
 abstract class AppDatabase: RoomDatabase() {

  abstract fun myDao():MyDao

  companion object{
   private var appDatabase:AppDatabase? = null

   @Synchronized
   fun getInstance(context:Context):AppDatabase{
    if (appDatabase==null){
     appDatabase = Room.databaseBuilder(context , AppDatabase::class.java , "my_user")
      .fallbackToDestructiveMigration()
      .allowMainThreadQueries()
      .build()
    }

    return appDatabase!!
   }

  }

}