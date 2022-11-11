package model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Document
public class CreditCard {
    private String name;
    private String cardNumber;
    private LocalDate date;
    private Integer securityCode;

    public CreditCard(String name, String cardNumber, LocalDate date, Integer securityCode) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.date = date;
        this.securityCode = securityCode;
    }

    public CreditCard() {
        name = "";
        cardNumber = "";
        date = null;
        securityCode = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public Integer getSecurityCode() {
        return this.securityCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSecurityCode(Integer securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CreditCard other = (CreditCard) o;
        return Objects.equals(this.name, other.name) &&
          Objects.equals(this.cardNumber, other.cardNumber) &&
          Objects.equals(this.date, other.date) &&
          Objects.equals(this.securityCode, other.securityCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.cardNumber, this.date, this.securityCode);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
          "name='" + this.name + '\'' +
          ", cardNumber='" + this.cardNumber + '\'' +
          ", date=" + this.date +
          ", securityCode=" + this.securityCode +
          '}';
    }
}
