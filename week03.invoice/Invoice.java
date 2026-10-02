public class Invoice {
        String partNumber;
        String partDescription;
        int quantity;
        double pricePerItem;

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
            return quantity;
        }
        double get_pricePerItem(){
            return pricePerItem;
        }

        //set quantity to 0 
        public void set_quantity(){
            this.quantity = (quantity<0) ? quantity : 0;
        }
        public void set_pricePerItem(){
            this.pricePerItem = (pricePerItem<0) ? pricePerItem : 0;
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
