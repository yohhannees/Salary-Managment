import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HotelManagementSystem {

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Map to store admin login credentials
    private static final Map<String, String> adminLoginCredentials = new HashMap<>();

    // Map to store receptionist login credentials
    private static final Map<String, String> receptionistLoginCredentials = new HashMap<>();

    private static final String[] hotelCheckInData = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            clearScreen();
        }

        // Initialize admin login credentials
        adminLoginCredentials.put("admin", "password");

        while (true) {
            System.out.println("Welcome to the Hotel Management System!");
            System.out.println("1. Admin Login");
            System.out.println("2. Receptionist Login");
            System.out.println("3. Add New Admin");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Admin Username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = scanner.nextLine();

                    if (adminLoginCredentials.containsKey(adminUsername)
                            && adminLoginCredentials.get(adminUsername).equals(adminPassword)) {
                        // Admin logged in successfully
                        clearScreen();
                        System.out.println("Admin Login Successful!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                        while (true) {
                            System.out.println("1. Add New Receptionist");
                            System.out.println("2. Show All Registered Receptionists");
                            System.out.println("3. Logout");

                            int adminChoice = scanner.nextInt();
                            scanner.nextLine();

                            switch (adminChoice) {
                                case 1:
                                    System.out.print("Enter New Receptionist Username: ");
                                    String newReceptionistUsername = scanner.nextLine();
                                    System.out.print("Enter New Receptionist Password: ");
                                    String newReceptionistPassword = scanner.nextLine();

                                    // Check if new receptionist already exists
                                    if (receptionistLoginCredentials.containsKey(newReceptionistUsername)) {
                                        System.out.println("Receptionist Username Already Exists!");
                                        System.out.println("");
                                        System.out.println("");

                                    } else {
                                        // Add new receptionist to the map
                                        receptionistLoginCredentials.put(newReceptionistUsername,
                                                newReceptionistPassword);
                                        clearScreen();
                                        System.out.println("New Receptionist Added Successfully!");
                                        System.out.println("");
                                        System.out.println("");
                                    }

                                    break;

                                case 2:
                                    // Show all registered receptionists
                                    clearScreen();
                                    System.out.println("Registered Receptionists:");
                                    System.out.println("");

                                    for (String username : receptionistLoginCredentials.keySet()) {
                                        System.out.println("=====" + username + "=====");
                                        System.out.println("");
                                    }

                                    break;

                                case 3:
                                    clearScreen();
                                    System.out.println("Admin Logged Out Successfully.");
                                    System.out.println("");
                                    System.out.println("");

                                    break;

                                default:
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    break;
                            }

                            if (adminChoice == 3) {
                                break;
                            }
                        }

                    } else {
                        clearScreen();
                        System.out.println("Invalid Admin Username or Password!");

                    }

                    break;

                case 2:
                    System.out.print("Enter Receptionist Username: ");
                    String receptionistUsername = scanner.nextLine();
                    System.out.print("Enter Receptionist Password: ");
                    String receptionistPassword = scanner.nextLine();

                    if (receptionistLoginCredentials.containsKey(receptionistUsername)
                            && receptionistLoginCredentials.get(receptionistUsername).equals(receptionistPassword)) {
                        // Receptionist logged in successfully
                        clearScreen();
                        System.out.println("");
                        System.out.println("");

                        System.out.println("Receptionist Login Successful!");
                        System.out.println("");
                        System.out.println("");

                        while (true) {
                            System.out.println("1. Check-In Customer");
                            System.out.println("2. Check-Out Customer");
                            System.out.println("3. View Customer Details");
                            System.out.println("4. Logout");

                            int receptionistChoice = scanner.nextInt();
                            scanner.nextLine();

                            String[] customerNames = new String[100];
                            String[] customerMobileNumbers = new String[100];
                            String[] customerIds = new String[100];
                            String[] customerGenders = new String[100];
                            String[] checkInDates = new String[100];
                            String[] roomTypes = new String[100];
                            int[] roomNumbers = new int[100];
                            double[] prices = new double[100];
                            String[] addresses = new String[100];
                            ArrayList<EmpDetail> list = new ArrayList<EmpDetail>();

                            int x = 0;
                            switch (receptionistChoice) {

                                case 1:
                                         
                           
                                    System.out.print("Enter Customer Name: ");
                                    String Name = scanner.nextLine();
                                  

                                    System.out.print("Enter Customer Mobile Number: ");
                                    String MobileNumber = scanner.nextLine();
                               

                                    System.out.print("Enter Customer ID: ");
                                    String Id = scanner.nextLine();
                                

                                    System.out.print("Enter Customer Gender: ");
                                    String Gender = scanner.nextLine();
                          

                                    System.out.print("Enter Check-In Date: ");
                                    String checkInDate = scanner.nextLine();
                                
                                    System.out.print("Enter Room Type: ");
                                    String roomType = scanner.nextLine();
                           

                                    System.out.print("Enter Room Number: ");
                                    int roomNumber = scanner.nextInt();
                             

                                    System.out.print("Enter Price: ");
                                    double price = scanner.nextDouble();
                               
                                    scanner.nextLine();

                                    System.out.print("Enter Address: ");
                                    String address = scanner.nextLine();
                                    
                                    list.add(new EmpDetail(Name,MobileNumber,Id,Gender,CheckInDate,roomType,roomNumber,price,address));
                                    System.out.println("Data Successfully Entered");
                                    // in case 1, read the input data and add to arrays
                                 
                                    break;

                                    // for (int i = 0; i < x; i++) {
                                    //     // in case 1, read the input data and add to arrays
                                    //     System.out.print("Enter Customer Name: ");
                                    //     String customerName = scanner.next();
                                    //     customerNames[i] = customerName;

                                    //     System.out.print("Enter Customer Mobile Number: ");
                                    //     String customerMobileNumber = scanner.next();
                                    //     customerMobileNumbers[i] = customerMobileNumber;

                                    //     System.out.print("Enter Customer ID: ");
                                    //     String customerId = scanner.next();
                                    //     customerIds[i] = customerId;

                                    //     System.out.print("Enter Customer Gender: ");
                                    //     String customerGender = scanner.next();
                                    //     customerGenders[i] = customerGender;

                                    //     System.out.print("Enter Check-In Date: ");
                                    //     String checkInDate = scanner.next();
                                    //     checkInDates[i] = checkInDate;

                                    //     System.out.print("Enter Room Type: ");
                                    //     String roomType = scanner.next();
                                    //     roomTypes[i] = roomType;

                                    //     System.out.print("Enter Room Number: ");
                                    //     int roomNumber = scanner.nextInt();
                                    //     roomNumbers[i] = roomNumber;

                                    //     System.out.print("Enter Price: ");
                                    //     double price = scanner.nextDouble();
                                    //     prices[i] = price;

                                    //     scanner.nextLine();

                                    //     System.out.print("Enter Address: ");
                                    //     String address = scanner.nextLine();
                                    //     addresses[i] = address;

                                    // }

                                    // create arrays to store the customer data

                                    // x++;
                                    System.out.println("Customer Checked-In Successfully!");

                                    // break;

                                case 2:
                                    System.out.print("Enter Room Number: ");
                                    int checkOutRoomNumber = scanner.nextInt();

                                    // Do something with check-out data

                                    System.out.println("Customer Checked-Out Successfully!");
                                    break;

                                case 3:

                                    for (int i = 0; i < x; i++) {
                                        System.out.println("Customer Name: " + customerNames[i]);
                                        System.out.println("Mobile Number: " + customerMobileNumbers[i]);
                                        System.out.println("ID: " + customerIds[i]);
                                        System.out.println("Gender: " + customerGenders[i]);
                                        System.out.println("Check-In Date: " + checkInDates[i]);
                                        System.out.println("Room Type: " + roomTypes[i]);
                                        System.out.println("Room Number: " + roomNumbers[i]);
                                        System.out.println("Price: " + prices[i]);
                                        System.out.println("Address: " + addresses[i]);
                                    }
                                    break;

                                case 4:
                                    clearScreen();
                                    System.out.println("Receptionist Logged Out Successfully.");
                                    System.out.println("");
                                    System.out.println("");
                                    break;

                                default:
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    break;
                            }

                            if (receptionistChoice == 4) {
                                break;
                            }
                        }
                        // Receptionist functionality goes here

                    } else {
                        clearScreen();
                        System.out.println("Invalid Receptionist Username or Password!");
                        System.out.println("");
                        System.out.println("");

                    }

                    break;

                case 3:
                    System.out.print("Enter New Admin Username: ");
                    String newAdminUsername = scanner.nextLine();
                    System.out.print("Enter New Admin Password: ");
                    String newAdminPassword = scanner.nextLine();
                    if (adminLoginCredentials.containsKey(newAdminUsername)) {
                        System.out.println("Admin Username Already Exists!");
                    } else {
                        // Add new admin to the map
                        adminLoginCredentials.put(newAdminUsername, newAdminPassword);
                        clearScreen();
                        System.out.println("New Admin Added Successfully!");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");

                    }

                    break;

                case 4:
                    clearScreen();
                    System.out.println("Thank you for using the Hotel Management System!");
                    System.out.println("");
                    System.out.println("");
                    return;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
                    break;
            }
        }
    }
}
