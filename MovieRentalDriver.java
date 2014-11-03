/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Part2;

import java.util.ArrayList;

/**
 *
 * @author tucker.stone061
 */
public class MovieRentalDriver {
    
    public static void main( String [] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer cust1 = new Customer("Frank");
        Customer cust2 = new Customer("Sarah");
        Customer cust3 = new Customer("Alice");
        
        cust1.addRental(new Rental(new Movie("Pirates of the Caribean", Movie.REGULAR), 6));
        cust1.addRental(new Rental(new Movie("Avatar", Movie.NEW_RELEASE), 6));
        cust1.addRental(new Rental(new Movie("Frozen", Movie.CHILDRENS), 6));
        cust2.addRental(new Rental(new Movie("Pulp Fiction", Movie.REGULAR), 6));
        cust2.addRental(new Rental(new Movie("Fight Club", Movie.REGULAR), 6));
        cust2.addRental(new Rental(new Movie("Lion King", Movie.CHILDRENS), 6));
        cust3.addRental(new Rental(new Movie("Sandlot", Movie.CHILDRENS), 6));
        cust3.addRental(new Rental(new Movie("Bad News Bears", Movie.CHILDRENS), 6));
        cust3.addRental(new Rental(new Movie("Take Me Home Tonight", Movie.NEW_RELEASE), 6));
        
        System.out.println(cust1.statement());
        System.out.println(cust2.statement());
        System.out.println(cust3.statement());
    }
    
}
