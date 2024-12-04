public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";

        double coffeePrice = 2.5;
        double lattePrice = 3.5;
        double cappuccinoPrice = 4.5;

        // Define customer variables for Ahmad, Sali, and Adam.
        String customer1 = "Ahmad";
        String customer2 = "Sali";
        String customer3 = "Adam";

        // Create the order status flag (true/false) for each customer.
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;

        // Sali ordered a coffee. 
        System.out.println(
            generalGreeting + customer2 + 
            (isReadyOrder2 ? readyMessage + displayTotalMessage + coffeePrice :pendingMessage));
        
        // Ahmad ordered a cappuccino.
        System.out.println(
            generalGreeting + customer1 + 
            (isReadyOrder1 ? readyMessage + displayTotalMessage + cappuccinoPrice :pendingMessage));   
    
        // Sali just ordered 2 lattes.
        System.out.println(
            generalGreeting + customer2 + 
            (isReadyOrder3 ? readyMessage + displayTotalMessage + (lattePrice * 2) :pendingMessage));   
    
        // Adam just realized he was charged for a coffee but had ordered a latte.
        System.out.println(
            generalGreeting +  customer3 + ", " +
            (displayTotalMessage + (lattePrice - coffeePrice)));   

    }
}