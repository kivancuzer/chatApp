package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "table_user")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name="username")
    private String username;

    @NonNull
    @ColumnInfo(name = "password")
    private String password;

    @NonNull
    @ColumnInfo(name = "grant_type")
    private String grant_type;

    @NonNull
    @ColumnInfo(name = "client_id")
    private String client_id;

    @NonNull
    @ColumnInfo(name = "scope")
    private String scope;

    public User(@NonNull String username, @NonNull String password, @NonNull String grant_type, @NonNull String client_id, @NonNull String scope) {
        this.username = username;
        this.password = password;
        this.grant_type = grant_type;
        this.client_id = client_id;
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(@NonNull String grant_type) {
        this.grant_type = grant_type;
    }

    @NonNull
    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(@NonNull String client_id) {
        this.client_id = client_id;
    }

    @NonNull
    public String getScope() {
        return scope;
    }

    public void setScope(@NonNull String scope) {
        this.scope = scope;
    }
}
