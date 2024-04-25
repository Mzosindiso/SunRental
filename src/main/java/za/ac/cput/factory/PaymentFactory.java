package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Helper;

import java.time.LocalDateTime;

public class PaymentFactory {
    public static Payment buildPayment(String reservationID, String totalAmount, String paymentAmount, LocalDateTime date){
        if(Helper.isNullorEmpty(reservationID) || Helper.isNullorEmpty(totalAmount) || Helper.isNullorEmpty(paymentAmount)) {
            return null;
        }
        String paymentID = Helper.generateId(); // Assume generateId() generates a unique ID
        return new Payment.Builder().setPaymentID(paymentID)
                .setReservationID(reservationID)
                .setPaymentType(paymentAmount)
                .setTotalAmount(totalAmount)
                .setDate(date)
                .build();
    }
}
