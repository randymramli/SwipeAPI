package model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


public enum PaymentType {
    Cash("CASH"),
    Debit("DEBIT"),
    Credit("CREDIT");

    private final String value;

    PaymentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (PaymentType paymentType : PaymentType.values()) {
            values.add(paymentType.getValue());
        }
        return values;
    }

    public static PaymentType parse(String value) {
        switch (value) {
            case "CASH":
                return PaymentType.Cash;
            case "DEBIT":
                return PaymentType.Debit;
            case "CREDIT":
                return PaymentType.Credit;
            default:
                throw new IllegalArgumentException("Unknown Value");
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
