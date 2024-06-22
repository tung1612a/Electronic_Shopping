/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tran tung
 */
public class productSpecifications {
   private String productID,screensize,CPU,RAM,storageCapacity;
   public productSpecifications(){
       
   }
    public productSpecifications(String productID, String screensize, String CPU, String RAM, String storageCapacity) {
        this.productID = productID;
        this.screensize = screensize;
        this.CPU = CPU;
        this.RAM = RAM;
        this.storageCapacity = storageCapacity;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSreensize() {
        return screensize;
    }

    public void setSreensize(String sreensize) {
        this.screensize = sreensize;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "productSpecifications{" + "productID=" + productID + ", sreensize=" + screensize + ", CPU=" + CPU + ", RAM=" + RAM + ", storageCapacity=" + storageCapacity + '}';
    }
   
}
