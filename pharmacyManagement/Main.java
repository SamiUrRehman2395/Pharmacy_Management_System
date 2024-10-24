package pharmacyManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Antibiotic amoxicillin = new Antibiotic("Amoxicillin", "ABC Pharma", "2024-12-01", "Broad");
        Analgesic ibruprofen = new Analgesic("Ibuprofen", "XYZ Pharma", "2024-05-15", "Acute");
        Antibiotic ciprofloxacin = new Antibiotic("Ciprofloxacin", "123 Pharma", "2023-06-15", "Broad");
        Analgesic paracetamol = new Analgesic("Paracetamol", "456 Pharma", "2025-09-30", "General");
        Antibiotic erythromycin = new Antibiotic("Erythromycin", "789 Pharma", "2023-09-25", "Broad");

//        PharmaControl pharmaControl = new PharmaControl();

       // Add medicines to inventory
        PharmaControl.addToInventory(amoxicillin);
        PharmaControl.addToInventory(paracetamol);
        PharmaControl.addToInventory(ciprofloxacin);
        PharmaControl.addToInventory(ibruprofen);
        PharmaControl.addToInventory(erythromycin);

        System.out.println();
        // Search for medicine
        System.out.println("Search Results for Amoxicillin:");
        PharmaControl.searchInInventory("Amoxicillin");

        System.out.println();
        // Remove medicine
        PharmaControl.removeFromInventory("Ibuprofen");

        System.out.println();
        // Search for removed medicine
        System.out.println("Search Results for Ibuprofen:");
        PharmaControl.searchInInventory("Ibuprofen");


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
                   5. Issue Medicine
                   6. Restock Medicine
                   7. Exit Program
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
                        PharmaControl.addToInventory(a);
                    }
                    else if (type == 2) {
                        System.out.println("Enter pain type");
                        String painType = sc.nextLine();
                        Analgesic a2 = new Analgesic(medName, manufacturer, expiryDate, painType);
                        PharmaControl.addToInventory(a2);
                    }
                    break;

                    case 2:
                        System.out.println("Enter Medicine Name: ");
                        String medName2 = sc.nextLine();
                        PharmaControl.removeFromInventory(medName2);
                        break;

                        case 3:
                            System.out.println("Enter Medicine Name: ");
                            String medName3 = sc.nextLine();
                            PharmaControl.searchInInventory(medName3);
                            break;
                            case 4:
                                PharmaControl.generateReport();
                                break;
                                case 5:
                                    System.out.println("Enter Medicine Name To Issue: ");
                                    String medName4 = sc.nextLine();
                                    PharmaControl.issueMedicine(medName4);
                                    break;

                case 6:
                    System.out.println("Enter medicine details you want to restock");
                    System.out.println("Enter\n 1 for Antibiotic\n 2 for Analgesic");
                    int type2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Medicine Name: ");
                    String medName5 = sc.nextLine();
                    System.out.println("Enter Manufacturer: ");
                    String manufacturer5 = sc.nextLine();
                    System.out.println("Enter Expiry Date (YYYY-MM-DD): ");
                    String expiryDate5 = sc.nextLine();

                    if (type2 == 1) {
                        System.out.println("Enter Spectrum");
                        String spectrum = sc.nextLine();
                        Antibiotic a = new Antibiotic(medName5, manufacturer5, expiryDate5, spectrum);
                        PharmaControl.restokeMedicine(a);
                    }
                    else if (type2 == 2) {
                        System.out.println("Enter pain type");
                        String painType = sc.nextLine();
                        Analgesic a2 = new Analgesic(medName5, manufacturer5, expiryDate5, painType);
                        PharmaControl.addToInventory(a2);
                    }
                    break;


                case 7:
                    System.out.println("Exit Program");
                    break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;


            }
        }

    }
}
