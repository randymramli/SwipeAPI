package model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Data
@Builder
@Document
public class RegisterInfo {
    private String email;
    private String username;
    private String password;
    private AccountType accountType;

    public RegisterInfo(String email, String username, String password, AccountType accountType) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public AccountType getAccountType() {
        return this.accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RegisterInfo other = (RegisterInfo) o;
        return Objects.equals(this.email, other.email) &&
          Objects.equals(this.username, other.username) &&
          Objects.equals(this.password, other.password) &&
          this.accountType == other.accountType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email, this.username, this.password, this.accountType);
    }

    @Override
    public String toString() {
        return "RegisterInfo{" +
          "email='" + this.email + '\'' +
          ", username='" + this.username + '\'' +
          ", password='" + this.password + '\'' +
          ", accountType=" + this.accountType +
          '}';
    }
}
