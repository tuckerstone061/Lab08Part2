/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Part2;

/**
 *
 * @author tucker.stone061
 */
public class Movie extends Price {
    
    private String title;
    private int    priceCode;
    
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    
    public int getPriceCode() {
        return this.priceCode;
    }
    
    public void setPriceCode(int price) {
        this.priceCode = price;
    }
    
    public String getTitle() {
        return this.title;
    }
}
