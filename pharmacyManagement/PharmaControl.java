package pharmacyManagement;

public class PharmaControl {

    Pharmaceutical[] pharmaceutical = new Pharmaceutical[10];

    private int Inventorycount = 0;

    public void addToInventory(Pharmaceutical medicine) {

        if (Inventorycount >= pharmaceutical.length){
            System.out.println("Inventory is full");
            return;
        }
        for (int i = 0; i < Inventorycount; i++) {
            if(pharmaceutical[i].IsEquivalent(medicine)){
                System.out.println("Medicine already exists");
            }

        }
        pharmaceutical[Inventorycount] = medicine;
        Inventorycount++;
        System.out.println("Medicine added");
    }



    public void removeFromInventory(String medicine) {
        for (int i = 0; i < Inventorycount; i++) {
            if(pharmaceutical[i].getMedName().equalsIgnoreCase(medicine)){
                pharmaceutical[i] = null;
                Inventorycount--;
                System.out.println("Medicine removed");
                return;


            }



        }

        System.out.println("Medicine not found");


    }
    public void searchInInventory(String medicine) {

        for(int i = 0; i < Inventorycount; i++){
            if(pharmaceutical[i] != null && pharmaceutical[i].getMedName().equalsIgnoreCase(medicine)){
                System.out.println("Medicine Found: " );
                pharmaceutical[i].displaySpec();
                return;
            }


        }
        System.out.println("Medicine not found");

    }
    public void issueMedicine(){

    }
    public void restokeMedicine(){

    }
    public void generateReport(){

            if(Inventorycount ==0){
                System.out.println("Inventory Is Empty");
                return;
            }
        else{
            for(int i = 0; i < Inventorycount; i++){
                pharmaceutical[i].displaySpec();
                System.out.println("-------------------");
            }
            }



    }
}
