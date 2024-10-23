package pharmacyManagement;

public class Analgesic extends Pharmaceutical implements Classifiable{
    String painType;

Analgesic(String medName, String manufacturer, String expiryDate, String painType){
    super(medName, manufacturer, expiryDate, StockStatus.IN_STOCK);
    this.painType = painType;
    
}

    @Override
    public void displaySpec() {
        System.out.println("Analgesic: " + medName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Pain Type: " + painType);
        System.out.println("Stock Status: " + status);
    }

    @Override
    public void addMedicine() {
        System.out.println(medName + "added to Inventory");
    }

    @Override
    public void removeMedicine() {
        System.out.println(medName + "removed from Inventory");
    }

    @Override
    public void searchMedicine() {
        System.out.println("Searched for" + medName);
    }
}
