package invoice;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter partnumber: ");
        String partnumber = sc.next();
        System.out.println("Enter description: ");
        String description = sc.next();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        //create invoice to test
        Invoice test = new Invoice(partnumber, description, quantity, price);
        System.out.println("partnumber: "+ test.get_partNumber()+ " description: "+ test.get_partDescription()+" quantity: "+ test.get_quantity() + " price: " + test.get_pricePerItem() + " Invoice: " + test.getInvoiceAmount());
        System.out.println(test.toString());
    }
}
