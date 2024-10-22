package pharmacyManagement;

public class Antibiotic extends Pharmaceutical implements Classifiable{
    String spectrum;

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
        System.out.println("Searched for " + medName);

    }

    Antibiotic(String medName, String manufacturer, String expiryDate, String spectrum) {
        super(medName, manufacturer, expiryDate, StockStatus.IN_STOCK);
        this.spectrum = spectrum;
    }


    @Override
    public void displaySpec() {
        System.out.println("Antibiotic: " + medName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Spectrum: " + spectrum);
        System.out.println("Stock Status: " + status);

    }
}
