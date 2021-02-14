package com.marathideveloper.room_database_kotlin.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract  fun userDao():UserDao

    companion object{
        @Volatile
        private var INSTANCE:AppDatabase?=null

        fun getDatabse(context: Context):AppDatabase{
            val tempInstsnce = INSTANCE
            if(tempInstsnce!=null) return tempInstsnce

            synchronized(this){
                val insance= Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE =insance
                return  insance
            }
        }
    }
}