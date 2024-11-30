import java.util.*;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        customers = new ArrayList<>();
    }

    // Method to add a customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to sort customers based on the criteria
    public void sortCustomers() {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer c1, Customer c2) {
                // First compare by First Name
                int firstNameComparison = c1.getFirstName().compareTo(c2.getFirstName());
                if (firstNameComparison != 0) {
                    return firstNameComparison;
                }

                // If First Names are the same, compare by Last Name
                int lastNameComparison = c1.getLastName().compareTo(c2.getLastName());
                if (lastNameComparison != 0) {
                    return lastNameComparison;
                }

                // If both First and Last Names are the same, compare by ID
                int idComparison = Integer.compare(c1.getId(), c2.getId());
                if (idComparison != 0) {
                    return idComparison;
                }

                // If First Name, Last Name, and ID are the same, compare by Balance
                return Double.compare(c1.getBalance(), c2.getBalance());
            }
        });
    }

    // Method to display all customers
    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}

