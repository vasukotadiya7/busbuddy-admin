package com.vasukotadiya.bbadmin.Model;

public class UserModel {
    public String Name;
    public String PhoneNo;
    public String Email;
    public String Seat;
    public String Refund;
    public String TransactionID;

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }

    public String getRefund() {
        return Refund;
    }

    public void setRefund(String refund) {
        Refund = refund;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSeat() {
        return Seat;
    }

    public void setSeat(String seat) {
        Seat = seat;
    }

}
