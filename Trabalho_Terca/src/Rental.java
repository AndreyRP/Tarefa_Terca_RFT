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
      //determine amounts for aRental line
      double var = 0;
        switch (aRental.getMovie().getPriceCode()) {
        
           case Movie.REGULAR:
              var += 2;
              if (aRental.getDaysRented() > 2)
                 var += (aRental.getDaysRented() - 2) * 1.5;
              break;
           case Movie.NEW_RELEASE:
              var += aRental.getDaysRented() * 3;
              break;
           case Movie.CHILDRENS:
              var += 1.5;
              if (aRental.getDaysRented() > 3)
                 var += (aRental.getDaysRented() - 3) * 1.5;
               break;
        }

        return var;
   } 
}
