public class Movie {
    
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private Price _price;

   public Movie(String name, int priceCode) {
      _title = name;
      setPriceCode(priceCode);
   }
    
   public int getPriceCode() {
      return _price.getPriceCode();
   }
   
   public void setPriceCode(int arg) {
      switch (arg) {
         case REGULAR:
            _price = new RegularPrice();
            break;
         case CHILDRENS:
            _price = new ChildrensPrice();
            break;
         case NEW_RELEASE:
            _price = new NewReleasePrice();
            break;
         default:
            throw new IllegalArgumentException("Incorrect Price Code");
      }
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

