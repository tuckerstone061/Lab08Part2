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
public abstract class Price {
    
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    public int getPriceCode() {
        return 0;
    }
    
    public double getCharge(int daysRented) {
        
    }
    
    public int getFrequentRenterPoints(int daysRented) {
        
    }
}
