package za.ac.cput.domain;

/*
 * Payment.java
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Payment {
    private String paymentID;
    private String reservationID;
    private String totalAmount;
    private String paymentType;
    private LocalDateTime date;

    private Payment(){

    }

    private Payment(Builder builder){
        this.paymentID = builder.paymentID;
        this.reservationID = builder.reservationID;
        this.totalAmount = builder.totalAmount;
        this.paymentType = builder.paymentType;
        this.date = builder.date;
    }
    //Getters
    public String getPaymentID() {
        return paymentID;
    }

    public String getReservationID() {
        return reservationID;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Payment payment = (Payment) o;
            return Objects.equals(paymentID, payment.paymentID) &&
                Objects.equals(reservationID, payment.reservationID) &&
                Objects.equals(totalAmount, payment.totalAmount) &&
                Objects.equals(paymentType, payment.paymentType);
    }

    @Override
    public int hashCode(){
        return Objects.hash(paymentID, reservationID, totalAmount, paymentType);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", reservationID='" + reservationID + '\'' +
                ", totalAmount=" + totalAmount +
                ", paymentType='" + paymentType + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class Builder{
        private String paymentID;
        private String reservationID;
        private String totalAmount;
        private String paymentType;
        private LocalDateTime date;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setReservationID(String reservationID) {
            this.reservationID = reservationID;
            return this;
        }

        public Builder setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder setDate(LocalDateTime date) {
            this.date = date;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentID = payment.paymentID;
            this.reservationID = payment.reservationID;
            this.totalAmount = payment.totalAmount;
            this.paymentType = payment.paymentType;
            this.date = payment.date;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}