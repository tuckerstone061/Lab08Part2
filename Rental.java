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
public class Rental {
    private Movie movie;
    private int   daysRented;
    
    public Rental(Movie movie, int daysRented) {
        this.movie      = movie;
        this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return this.daysRented;
    }
    
    public Movie getMovie() {
        return this.movie;
    }
}
