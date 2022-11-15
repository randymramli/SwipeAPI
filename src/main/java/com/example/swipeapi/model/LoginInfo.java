package com.example.swipeapi.model;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class LoginInfo {
    private String username;
    private String password;
    public LoginInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LoginInfo other = (LoginInfo) o;
        return Objects.equals(this.username, other.username) &&
          Objects.equals(this.password, other.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.password);
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
          "username='" + this.username + '\'' +
          ", password='" + this.password + '\'' +
          '}';
    }
}
