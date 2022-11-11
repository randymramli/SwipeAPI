package model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Data
@Document(collation = "User")
public class User {

    @Id
    private UUID idNum;
    private String username;
    private String password;
    private String email;
    private Double accountBalance;
    private AccountType accountType;

    public User(String username, String password, String email, Double accountBalance,
                AccountType accountType) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public User() {
        username = "";
        password = "";
        email = "";
        accountBalance = 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        User other = (User) o;
        return Objects.equals(this.username, other.username) &&
          Objects.equals(this.password, other.password) &&
          Objects.equals(this.email, other.email) &&
          Objects.equals(this.accountBalance, other.accountBalance) &&
          this.accountType == other.accountType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.password, this.email, this.accountBalance, this.accountType);
    }

    @Override
    public String toString() {
        return "User{" +
          "username='" + this.username + '\'' +
          ", password='" + this.password + '\'' +
          ", email='" + this.email + '\'' +
          ", accountBalance=" + this.accountBalance +
          ", accountType=" + this.accountType +
          '}';
    }
}

