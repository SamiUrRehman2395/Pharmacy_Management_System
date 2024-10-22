package pharmacyManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Antibiotic amoxicillin = new Antibiotic("Amoxicillin", "ABC Pharma", "2024-12-01", "Broad");
        Analgesic ibruprofen = new Analgesic("Ibuprofen", "XYZ Pharma", "2024-05-15", "Acute");
        Antibiotic ciprofloxacin = new Antibiotic("Ciprofloxacin", "123 Pharma", "2023-06-15", "Broad");
        Analgesic paracetamol = new Analgesic("Paracetamol", "456 Pharma", "2025-09-30", "General");
        Antibiotic erythromycin = new Antibiotic("Erythromycin", "789 Pharma", "2023-09-25", "Broad");

        PharmaControl pharmaControl = new PharmaControl();

       // Add medicines to inventory
        pharmaControl.addToInventory(amoxicillin);
        pharmaControl.addToInventory(paracetamol);
        pharmaControl.addToInventory(ciprofloxacin);
        pharmaControl.addToInventory(ibruprofen);
        pharmaControl.addToInventory(erythromycin);

        System.out.println();
        // Search for medicine
        System.out.println("Search Results for Amoxicillin:");
        pharmaControl.searchInInventory("Amoxicillin");

        System.out.println();
        // Remove medicine
        pharmaControl.removeFromInventory("Ibuprofen");

        System.out.println();
        // Search for removed medicine
        System.out.println("Search Results for Ibuprofen:");
        pharmaControl.searchInInventory("Ibuprofen");


        System.out.println("\n");


        //PharmaControl pc = new PharmaControl();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                   ***************************
                   Pharmacy Management System
                   ***************************
                   1. Add Medicine to Inventory
                   2. Remove Medicine from Inventory
                   3. Search Medicine
                   4. Generate Report
                   5. Exit Program
                    """);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter medicine details");
                    System.out.println("Enter\n 1 for Antibiotic\n 2 for Analgesic");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Medicine Name: ");
                    String medName = sc.nextLine();
                    System.out.println("Enter Manufacturer: ");
                    String manufacturer = sc.nextLine();
                    System.out.println("Enter Expiry Date (YYYY-MM-DD): ");
                    String expiryDate = sc.nextLine();

                    if (type == 1) {
                        System.out.println("Enter Spectrum");
                        String spectrum = sc.nextLine();
                        Antibiotic a = new Antibiotic(medName, manufacturer, expiryDate, spectrum);
                        pharmaControl.addToInventory(a);
                    }
                    else if (type == 2) {
                        System.out.println("Enter pain type");
                        String painType = sc.nextLine();
                        Analgesic a2 = new Analgesic(medName, manufacturer, expiryDate, painType);
                        pharmaControl.addToInventory(a2);
                    }
                    break;
                    case 2:
                        System.out.println("Enter Medicine Name: ");
                        String medName2 = sc.nextLine();
                        pharmaControl.removeFromInventory(medName2);
                        break;
                        case 3:
                            System.out.println("Enter Medicine Name: ");
                            String medName3 = sc.nextLine();
                            pharmaControl.searchInInventory(medName3);
                            break;
                            case 4:
                                pharmaControl.generateReport();
                                break;
                                case 5:
                                    System.out.println("Exit Program");
                                    break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;


            }
        }

    }
}
