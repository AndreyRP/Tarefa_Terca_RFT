public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    double getCharge(Rental aRental) {
      return _movie.getCharge(_daysRented, aRental);
   } 

   public int getFrequentRenterPoints(Rental each) { 
        return _movie.getFrequentRenterPoints(_daysRented, each);
   }
   
}
