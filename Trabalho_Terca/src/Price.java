public abstract class Price {
   public abstract int getPriceCode();

   public abstract double getCharge(int daysRented, Rental aRental);
   
   public int getFrequentRenterPoints(int daysRented) {
      return 1;
   }
}
