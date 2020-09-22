package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "table_token")
public class Token {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @NonNull
    @ColumnInfo(name = "access_token")
    private String access_token;
    @NonNull
    @ColumnInfo(name = "expires_in")
    private Integer expires_in;
    @NonNull
    @ColumnInfo(name = "refresh_expires_in")
    private Integer refresh_expires_in;
    @NonNull
    @ColumnInfo(name = "refresh_token")
    private String refresh_token;
    @NonNull
    @ColumnInfo(name = "token_type")
    private String token_type;
    @NonNull
    @ColumnInfo(name = "id_token")
    private String id_token;
    @NonNull
    @SerializedName("not-before-policy")
    @ColumnInfo(name = "not_before_policy")
    private Integer not_before_policy;
    @NonNull
    @ColumnInfo(name = "session_state")
    private String session_state;
    @NonNull
    @ColumnInfo(name = "scope")
    private String scope;

    public Token(@NonNull String access_token, @NonNull Integer expires_in, @NonNull Integer refresh_expires_in, @NonNull String refresh_token, @NonNull String token_type, @NonNull String id_token, @NonNull Integer not_before_policy, @NonNull String session_state, @NonNull String scope) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.refresh_expires_in = refresh_expires_in;
        this.refresh_token = refresh_token;
        this.token_type = token_type;
        this.id_token = id_token;
        this.not_before_policy = not_before_policy;
        this.session_state = session_state;
        this.scope = scope;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(@NonNull String access_token) {
        this.access_token = access_token;
    }

    @NonNull
    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(@NonNull Integer expires_in) {
        this.expires_in = expires_in;
    }

    @NonNull
    public Integer getRefresh_expires_in() {
        return refresh_expires_in;
    }

    public void setRefresh_expires_in(@NonNull Integer refresh_expires_in) {
        this.refresh_expires_in = refresh_expires_in;
    }

    @NonNull
    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(@NonNull String refresh_token) {
        this.refresh_token = refresh_token;
    }

    @NonNull
    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(@NonNull String token_type) {
        this.token_type = token_type;
    }

    @NonNull
    public String getId_token() {
        return id_token;
    }

    public void setId_token(@NonNull String id_token) {
        this.id_token = id_token;
    }

    @NonNull
    public Integer getNot_before_policy() {
        return not_before_policy;
    }

    public void setNot_before_policy(@NonNull Integer not_before_policy) {
        this.not_before_policy = not_before_policy;
    }

    @NonNull
    public String getSession_state() {
        return session_state;
    }

    public void setSession_state(@NonNull String session_state) {
        this.session_state = session_state;
    }

    @NonNull
    public String getScope() {
        return scope;
    }

    public void setScope(@NonNull String scope) {
        this.scope = scope;
    }
}
