public class Movie {
    
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle (){
        return _title;
    }

    public double getCharge(int daysRented, Rental aRental){
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

   public int getFrequentRenterPoints(int daysRented, Rental each){
       if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            each.getDaysRented() > 1){
                return 2;
            }
            return 1;
   }

}

