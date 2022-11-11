package model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Builder
@Document
public class Transaction {
    private Integer transactionID;
    private User user;
    private CreditCard creditCard;
    private Double amount;
    private LocalDate date;
    private PaymentType paymentType;

    public Transaction(Integer transactionID, User user, CreditCard creditCard, Double amount,
      LocalDate date, PaymentType paymentType) {
        this.transactionID = transactionID;
        this.user = user;
        this.creditCard = creditCard;
        this.amount = amount;
        this.date = date;
        this.paymentType = paymentType;
    }

    public Transaction() {
        transactionID = 0;
        user = new User();
        creditCard = new CreditCard();
        amount = 0.0;
        date = null;
        paymentType = null;
    }

    public Integer getTransactionID() {
        return this.transactionID;
    }

    public User getUser() {
        return this.user;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public Double getAmount() {
        return this.amount;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Transaction other = (Transaction) o;
        return Objects.equals(this.transactionID, other.transactionID) &&
          Objects.equals(this.user, other.user) &&
          Objects.equals(this.creditCard, other.creditCard) &&
          Objects.equals(this.amount, other.amount) &&
          Objects.equals(this.date, other.date) &&
          this.paymentType == other.paymentType;
    }

    @Override
    public String toString() {
        return "Transaction{" +
          "transactionID=" + this.transactionID +
          ", user=" + this.user +
          ", creditCard=" + this.creditCard +
          ", amount=" + this.amount +
          ", date=" + this.date +
          ", paymentType=" + this.paymentType +
          '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.transactionID, this.user, this.creditCard, this.amount, this.date, this.paymentType);
    }
}
