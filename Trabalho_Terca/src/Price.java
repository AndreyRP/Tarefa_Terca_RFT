public abstract class Price {
   public abstract int getPriceCode();

   public abstract double getCharge(int daysRented, Rental aRental);
   
   public int getFrequentRenterPoints(int daysRented, Rental each) {
      if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            each.getDaysRented() > 1){
                return 2;
            }
            return 1;
   }
}
