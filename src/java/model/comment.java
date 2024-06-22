/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author tran tung
 */
public class comment {
  private  int id, accountID;
 private   String comment;
 private   Date timecomment;
  private  String productID;
  public comment(){
      
  }

    public comment(int id, int accountID, String comment, Date timecomment, String productID) {
        this.id = id;
        this.accountID = accountID;
        this.comment = comment;
        this.timecomment = timecomment;
        this.productID = productID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getTimecomment() {
        return timecomment;
    }

    public void setTimecomment(Date timecomment) {
        this.timecomment = timecomment;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "comment{" + "id=" + id + ", accountID=" + accountID + ", comment=" + comment + ", timecomment=" + timecomment + ", productID=" + productID + '}';
    }
  
}
