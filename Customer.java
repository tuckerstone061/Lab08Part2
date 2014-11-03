/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Part2;

import java.util.ArrayList;
import java.util.Enumeration;

/**
 *
 * @author tucker.stone061
 */


public class Customer {
    private String name;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
    
    public Customer (String name) {
        this.name = name;
    }
    
    public void addRental(Rental newRental) {
        this.rentals.add(newRental);
    }
    
    public String getName() {
        return this.name;
    }
    public ArrayList<Rental> getRentals() {
        ArrayList<Rental> temp = new ArrayList<Rental>();
        for (int i = 0; i < this.rentals.size(); i++) {
            temp.add(this.rentals.get(i));
        }
        return temp;
    }
    
    public String statement() {
    
        double      totalAmount          = 0;
        int         frequentRenterPoints = 0;
        String      result               = "Rental Record for " + getName() + "\n";
        
        for (int i = 0; i < this.rentals.size(); i++) {
            
            double cost = 0;
            Rental rental = this.rentals.get(i);
            
            // determine amounts for each line
            switch (rental.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    cost += 2;
                    if (rental.getDaysRented() > 2) {
                        cost += (rental.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    cost += rental.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    cost += 1.5;
                    if (rental.getDaysRented() > 3) {
                        cost += (rental.getDaysRented() - 3) * 1.5;
                    }
                    break;
            }
            
            // add frequent renter points
            frequentRenterPoints++;
            
            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                (rental.getDaysRented() > 1)) {
                    frequentRenterPoints++;
            }
            
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() +
                      "\t" + cost + "\n";
            totalAmount += cost;
        }
        
        // add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints +
                  " frequent renter points";
        return result;
    }
}