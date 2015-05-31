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
public class FreshProducts extends Products{
    
    private String packingDate;
    private String orginCountry;
    
    FreshProducts(String expirationDate, int lotNumber, String packingDate, String orginCountry){
        super(expirationDate, lotNumber);
        
        this.packingDate = packingDate;
        this.orginCountry = orginCountry;
    }

    public String getPackingDate() {
        return packingDate;
    }

    public String getOrginCountry() {
        return orginCountry;
    }

    public void setPackingDate(String packingDate) {
        this.packingDate = packingDate;
    }

    public void setOrginCountry(String orginCountry) {
        this.orginCountry = orginCountry;
    }
    
    @Override
    protected void printInfo(){
        this.printInfo();
        System.out.println("Packing Date: " + this.getPackingDate());
        System.out.println("Country of Orgin: " + this.getOrginCountry());
    }
    
}
