package invoice;

public class Invoice {
        private String partNumber;
        private String partDescription;
        private int quantity;
        private double pricePerItem;

        //constructor
        public Invoice(String number, String description, int quantity, double price){
            set_partNumber(number);
            set_partDescription(description);
            set_quantity(quantity);
            set_pricePerItem(price);
        }

        //setters
        void set_partNumber(String number){
            this.partNumber = number;
        }

        void set_partDescription(String description){
            this.partDescription = description;

        }

        void set_quantity(int quantity){
                this.quantity = quantity;
            
        }
        
        void set_pricePerItem(double price){
                this.pricePerItem = price;

        }
        //getters

        String get_partNumber(){
            return partNumber;
        }
        String get_partDescription(){
            return partDescription;
        }
        int get_quantity(){
            if(this.quantity<0){
                return 0;
            } else{
               return quantity;
            }
        }
        double get_pricePerItem(){
            if(pricePerItem<0){
               return 0.0;
            } else{
                return pricePerItem;

            }
        }


        //getinvoiceamount
        public double getInvoiceAmount(){
            return quantity*pricePerItem;
        }
        @Override 
        public String toString(){
            return "Description = "+ get_partDescription() + ". Number = "+ get_partNumber()  +". Invoice= " + getInvoiceAmount();
        }
    
}
