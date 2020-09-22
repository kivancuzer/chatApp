package com.example.chatapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Token.class,User.class},version = 1,exportSchema = false)
public abstract class KandyRoomDatabase extends RoomDatabase {

    public abstract  UserDao userDao();

    //Lazy Initialization => Singleton Pattern
    private static KandyRoomDatabase instance;

    //avoid to create new instance of class
    private KandyRoomDatabase(){}

    /**
     * Get Instance
     *
     * Global Accessor for Instance
     *
     * @param context The context for the database where will be used.
     * @return instance
     */
    public static KandyRoomDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    KandyRoomDatabase.class, "kandyDb")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }


}
