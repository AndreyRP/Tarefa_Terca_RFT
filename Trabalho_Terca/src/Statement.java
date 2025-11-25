import java.util.Enumeration;
import java.util.Vector;

public class Statement {

    private static Vector _rentals = new Vector();

    public String statement() {
     double totalAmount = 0;
     int frequentRenterPoints = 0;
     Enumeration rentals = _rentals.elements();
     String result = "Rental Record for " + Customer.getName() + "\n";
     Rental each = (Rental) rentals.nextElement();
     while (rentals.hasMoreElements()) {

        //show figures for this rental
        result += "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge(each)) + "\n";

     }
     //add footer lines
     result +=  "Amount owed is " + String.valueOf(Customer.getTotalCharge(each)) + "\n";
     result += "You earned " + String.valueOf(Customer.getTotalFrequentRenterPoints()) +
             " frequent renter points";
     return result;
   }

}
