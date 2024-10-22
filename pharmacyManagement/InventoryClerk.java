package pharmacyManagement;

public class InventoryClerk {
    String clerkID;
    String authCode;

    Pharmaceutical[] processedMedicine;

    public InventoryClerk(String clerkID, String authCode) {

        this.clerkID = clerkID;
        this.authCode = authCode;
        processedMedicine = new Pharmaceutical[10];
    }

    public void handleDuplicateMedicine(Pharmaceutical medicine) {
        System.out.println("Medicine already exists");
    }

}
