public class Main {
    public static void main(String[] args) {
        // Create CustomerManager instance
        CustomerManager customerManager = new CustomerManager();

        // Add customers
        customerManager.addCustomer(new Customer(1, "John", "Doe", 1000.50));
        customerManager.addCustomer(new Customer(2, "Alice", "Smith", 5000.00));
        customerManager.addCustomer(new Customer(3, "John", "Smith", 1500.75));
        customerManager.addCustomer(new Customer(4, "Bob", "Johnson", 2500.00));
        customerManager.addCustomer(new Customer(5, "Alice", "Jones", 4000.25));

        // Display customers before sorting
        System.out.println("Customers before sorting:");
        customerManager.displayCustomers();

        // Sort customers based on criteria (First Name, Last Name, ID, Balance)
        customerManager.sortCustomers();

        // Display customers after sorting
        System.out.println("\nCustomers after sorting:");
        customerManager.displayCustomers();
    }
}
