package personal.ex.OnlineStore;

import java.util.Scanner;

public class UserInterface {
    private LoginSystem loginSyst;
    private OnlineStore store;
    private Scanner scanner;

    public UserInterface() {
        this.loginSyst = new LoginSystem();
        this.store = loginSyst.getStore();
        this.scanner = new Scanner(System.in);
    }

    public void loadInterface() {
        System.out.println("Welcome to the Online Store!");
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private void register() {
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        loginSyst.register(username, password);
        store.addProducts(); // Add products to the store
        System.out.println("Registration successful!");
    }

    private void login() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (loginSyst.login(username, password)) {
            System.out.println("Login successful!");
            operateStore(username);
        } else {
            System.out.println("Invalid credentials, please try again.");
        }
    }

    private void operateStore(String username) {
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. View products");
            System.out.println("2. Add to cart");
            System.out.println("3. Checkout");
            System.out.println("4. Logout");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    store.getProducts().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    Product product = store.getProducts().stream()
                            .filter(p -> p.getName().equals(productName))
                            .findFirst()
                            .orElse(null);
                    if (product != null) {
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        store.addToCart(username, product, quantity);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.println(store.checkout(username));
                    break;
                case 4:
                    loginSyst.logout(username);
                    System.out.println("Logout successful!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
