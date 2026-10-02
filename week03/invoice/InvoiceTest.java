package invoice;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice test = new Invoice("17228", "new iphone 18 pro, in burgundy", 15 , 6000);
        System.out.println(test.get_partDescription());
        System.out.println(test.toString());
    }
}
