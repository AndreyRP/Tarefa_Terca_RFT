import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private static String _name;
   private static Vector _rentals = new Vector();

   public Customer (String name){
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg);
   }
   
   public static String getName (){
      return _name;
   }

   static double getTotalCharge(Rental each) {
      double result = 0;
      Enumeration rentals = _rentals.elements();
      while (rentals.hasMoreElements()) {
         
         result += each.getCharge(each);
         }
         return result;
   }

   static int getTotalFrequentRenterPoints(){
      int result = 0;
      Enumeration rentals = _rentals.elements();
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += each.getFrequentRenterPoints(each);
      }
      return result;
   }

   public String statement() {
      return new TextStatement().value(this);
   }

   public String htmlStatement() {
      return new HtmlStatement().value(this);
   }

}
