import java.util.Enumeration;
import java.util.Vector;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Vector _rentals = new Vector();
        Enumeration rentals = _rentals.elements();
        Rental each = (Rental) rentals.nextElement();
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";
        while (rentals.hasMoreElements()) {
            
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge(each)) + "\n";
        }
        //add footer lines
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge(each)) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }
}
