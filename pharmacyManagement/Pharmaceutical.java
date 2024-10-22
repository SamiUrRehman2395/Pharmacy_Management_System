package pharmacyManagement;


public abstract class Pharmaceutical {
    String medName;
    String manufacturer;
    String expiryDate;
    StockStatus status;

    Pharmaceutical(String medName, String manufacturer, String expiryDate, StockStatus status) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.status = status;


    }

    public abstract void displaySpec();

    public boolean IsEquivalent(Pharmaceutical that){
        return this.manufacturer.equalsIgnoreCase(that.manufacturer) && this.expiryDate.equals(that.expiryDate);
    }

    public String getMedName() {
        return medName;
    }
}
