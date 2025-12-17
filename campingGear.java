public class campingGear {


  //setting up the methods
    private int quantity;
    private String review;
    private boolean buy;

    public campingGear() {
        quantity = 30;
        review = "These products are amazing!";
        buy = true;
    }
    // constructor paramaters to have values
    public campingGear(int quantity, String review, boolean buy) {
        this.quantity = quantity;
        this.review = review;
        this.buy = buy;
    }
    // accessor methods
    public int getQuantity() {
        return quantity;
    }
    // accessor method
    public String getReview() {
        return review;
    }
    // accessor method

    public boolean getBuy() {
        return buy;
    }
// setter methods 
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
// setter methods 

    public void setReview(String review) {
        this.review = review;
    }
// setter methods 

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

  //toString to override and to print out information 
  
    public String toString() {
        return "Quantity: " + quantity +
               "\nReview: " + review +
               "\nBuy: " + buy;
    }
}
