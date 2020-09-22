package com.example.chatapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    /**
     * Adding User
     * <p>
     * OnConflictStrategy will be ignore conflict.
     * Same User won't be added into the database.
     *
     * @param user which will be added into the database
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addUser(User user);

    /**
     * Delete User Table
     */
    @Query("DELETE FROM table_user")
    void deleteAllUsers();

    /**
     * Delete a User
     *
     * @param user which will be deleted form database.
     */
    @Delete
    void delete(User user);

    /**
     * Get Users from database
     *
     * @return List of all users
     */
    @Query("SELECT * FROM table_user")
    List<User> getUsers();

    /**
     * Update User
     *
     * @param user which will be updated.
     */
    @Update
    void updateUser(User user);

    /**
     * Add token
     * <p>
     * OnConflictStrategy will be ignore conflict.
     * Same Token won't be added into the database.
     *
     * @param token which will be added into the database
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void addToken(Token token);

    /**
     * Delete Token
     *
     * @param token which will be deleted from database
     */
    @Delete
    void deleteToken(Token token);

    /**
     * Update Token
     *
     * @param token which will be updated.
     */
    @Update
    void updateToken(Token token);

    /**
     * Get Last Token
     *
     * @return Last token in the db.
     */
    @Query("SELECT * FROM table_token ORDER BY id DESC LIMIT 1;")
    Token getLastToken();

    /**
     * Delete All Tokens in DB
     */
    @Query("DELETE FROM table_token")
    void deleteAllTokens();

}
