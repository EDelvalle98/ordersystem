package HW;

public class ordersystem {
    public static void main(String[] args) {

        double miles = 20;
        double qty = 20;
        double rice = 5;

        double deliveryFee = 0;
        if (miles <= 5) {
            deliveryFee = 2;
        } else if (miles <= 15) {
            deliveryFee = 5;
        } else if (miles <= 25) {
            deliveryFee = 10;
        } else if (miles <= 50) {
            deliveryFee = 15;
        } else {
            deliveryFee = 20;
        }
        double total = (qty * rice + deliveryFee);

        System.out.println("Rice will cost $" + total);
    }
}
