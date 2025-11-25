import java.util.Enumeration;
import java.util.Vector;

public class HtmlStatement extends Statement {
private static Vector _rentals = new Vector();

     public String value(Customer aCustomer) {
      Enumeration rentals = _rentals.elements();
      Rental each = (Rental) rentals.nextElement();
      String result = "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
      while (rentals.hasMoreElements()) {
         
         //show figures for each rental
         result += each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge(each)) + "<BR>\n";
      }
      //add footer lines
      result += "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge(each)) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
      return result;
   }
}