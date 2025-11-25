public class NewReleasePrice extends Price {
   public int getPriceCode() {
       return Movie.NEW_RELEASE;
   }
    @Override
   public double getCharge(int daysRented, Rental aRental){
      return daysRented * 3;
   } 
}
