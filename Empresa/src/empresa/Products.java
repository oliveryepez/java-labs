/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author Oliver
 */
public class Products {
    protected String expirationDate;
    protected int lotNumber;
    
    
    Products(String expirationDate, int lotNumber){
        this.expirationDate = expirationDate;
        this.lotNumber = lotNumber;
    }
    
     public String getExpirationDate() {
        return expirationDate;
    }

    public int getLotNumber() {
        return lotNumber;
    }
    
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }
    
    protected void printInfo(){
        System.out.println("Expiration Date: " + this.getExpirationDate());
        System.out.println("Lot Number: " + this.getLotNumber());
    }
    
}
