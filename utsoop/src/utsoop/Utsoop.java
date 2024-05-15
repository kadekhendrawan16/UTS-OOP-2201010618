package utsoop;

/**
 *
 * @author hendrawan
 */
public class Utsoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        databarang Dbarang = new databarang();
//        Bteman.Storedata();
        String ul = "ya";
        do{
            System.out.println("A. View Data");
            System.out.println("B. Add Data");
            System.out.println("C. Edit Data");
            System.out.println("D. Delete Data");
            System.out.println("E. Exit");
            System.out.println("Choose option (A/B/C/D/E)");
            String mPIL = Dbarang.dtIN.nextLine();
            switch (mPIL){
            case "A":
                Dbarang.viewdata();
            
                break;
            case "B":
                Dbarang.Storedata();
            
                break;
            case "C":
                Dbarang.Update(0);
            
                break;
            case "D":
                Dbarang.Destroy(0);
            
                break;
            case "E":
                ul = "tidak";
            
                break;
            default:
                System.out.println("type A/B/C/D/E");
                break;
                
            }
        }while( ul.equals("ya") );
    }
    
}
