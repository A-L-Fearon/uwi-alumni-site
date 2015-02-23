package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * Created by fearon on 2/23/15.
 */

@Entity
public class Account extends Model {

    public long transactionId, transNo, senderId, receiverId;
    public double amount;

    public Account(long transactionId, long transNo, long senderId, long receiverId, double amount) {
        this.transactionId = transactionId;
        this.transNo = transNo;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.amount = amount;
    }

}
