package pharmacyManagement;

public class PharmaControl {

    static Pharmaceutical[] pharmaceutical = new Pharmaceutical[10];

    private static int Inventorycount = 0;

    public static void addToInventory(Pharmaceutical medicine) {

        if (Inventorycount >= pharmaceutical.length){
            System.out.println("Cannot add this medicine. Inventory is full");
            return;
        }
        for (int i = 0; i < Inventorycount; i++) {
            if(pharmaceutical[i].IsEquivalent(medicine)){
                System.out.println("Medicine already exists");
                return;
            }

        }
        pharmaceutical[Inventorycount] = medicine;
        Inventorycount++;
        System.out.println("Medicine added");
    }


    public static void removeFromInventory(String medicine) {
        for (int i = 0; i < Inventorycount; i++) {
            if(pharmaceutical[i] != null && pharmaceutical[i].getMedName().equalsIgnoreCase(medicine)){
                for (int j = i; j < Inventorycount -1; j++) {
                    pharmaceutical[j] = pharmaceutical[j+1];
//                    Inventorycount--;
                }
                pharmaceutical[Inventorycount-1] = null;
                Inventorycount--;
                System.out.println("Medicine removed");
                return;


            }



        }

        System.out.println("Medicine not found");


    }
    public static void searchInInventory(String medicine) {

        for(int i = 0; i < Inventorycount; i++){
            if(pharmaceutical[i] != null && pharmaceutical[i].getMedName().equalsIgnoreCase(medicine)){
                System.out.println("Medicine Found: " );
                pharmaceutical[i].displaySpec();
                return;
            }


        }
        System.out.println("Medicine not found");

    }
    public static void issueMedicine(String medicine) {
        for(int i = 0; i < Inventorycount; i++){
            if(pharmaceutical[i] != null && pharmaceutical[i].getMedName().equalsIgnoreCase(medicine)){

                for(int j=i; j<Inventorycount-1; j++) {
                    pharmaceutical[j] = pharmaceutical[j + 1];

                }
                pharmaceutical[Inventorycount-1] = null;
                Inventorycount--;
                System.out.println("Medicine Issued");
                return;


            }

        }
        System.out.println("Medicine not found");

    }
    public static void restokeMedicine(Pharmaceutical medicine) {
        for(int i = 0; i < Inventorycount; i++){
            if(pharmaceutical[i].IsEquivalent(medicine)){
                System.out.println("Medicine Already Exists.");
            }
        }
        pharmaceutical[Inventorycount] = medicine;
        Inventorycount++;
        System.out.println("Medicine restoked");


    }
    public static void generateReport(){

            if(Inventorycount ==0){
                System.out.println("Inventory Is Empty");
                return;
            }
        else{
            for(int i = 0; i < Inventorycount; i++){
                if(pharmaceutical[i] != null) {
                    pharmaceutical[i].displaySpec();
                    System.out.println("-------------------");
                }

            }

            }




    }
}
