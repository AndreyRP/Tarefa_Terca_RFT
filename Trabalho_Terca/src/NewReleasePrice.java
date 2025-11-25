public class NewReleasePrice extends Price {
   public int getPriceCode() {
       return Movie.NEW_RELEASE;
   }
    @Override
   public double getCharge(int daysRented, Rental aRental){
      return daysRented * 3;
   } 

   public int getFrequentRenterPoints(int daysRented) {
       return (daysRented > 1) ? 2: 1;
   }
}
