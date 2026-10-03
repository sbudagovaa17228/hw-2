package invoice;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice test = new Invoice("17228", "new iphone 18 pro, in burgundy", 15 , 6000);
        Invoice test1 = new Invoice(null, null, -1, -2);
        System.out.println("quantity: "+ test1.get_quantity() + " price: " + test1.get_pricePerItem());

        System.out.println(test.get_partDescription());
        System.out.println(test.toString());
    }
}
