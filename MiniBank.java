import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class MiniBank {
    private Connection conn;
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:oracle:thin:@//localhost:1521/MF19";
        final String user = "mf_manager";
        final String password = "mf_manager";

         try {
            MiniBank miniBankAdministration = new MiniBank(url, user, password);
            miniBankAdministration.startMiniBankAdministration();
         } catch (Exception e) {
            System.out.println("Connection couldnt be established: " + e.getMessage());
            return;
         }
    }

    public MiniBank(String url, String user, String password) throws SQLException {
        this.conn = DriverManager.getConnection(url, user, password);
        new MiniBankController(/*TODO conn*/);
        System.out.println("Connected!");
        System.out.println("Welcome to the MiniBank!");
    }

    public void startMiniBankAdministration() {
        Scanner sc = new Scanner(System.in);
        MiniBankController bankController;

        try {
            boolean running = true;
            bankController = new MiniBankController(/*TODO conn*/);
            while (running) {
                System.out.println("");
                System.out.println("Welcome to the miniBank");
                System.out.println("1. Insert new Customer");
                System.out.println("2. Pay out of Account");
                System.out.println("3. Pay in to Account");
                System.out.println("4. Show Customer data");
                System.out.println("5. Change Customer data");
                System.out.println("6. Stop programm");

                int option = sc.nextInt();
                sc.nextLine(); 

                switch (option) {
                    case 1:
                        MiniBankController.addCustomer();
                        break;
                    case 2:
                        //MiniBankController.doPayOut(sc); TODO
                        break;
                    case 3:
                        //MiniBankController.doPayIn(sc); TODO
                        break;
                    case 4:
                        MiniBankController.showCustomerData();
                        break;
                    case 5:
                        MiniBankController.changeCustomerData();
                        break;
                    case 6:
                        System.out.println("Stopping the Programm");
                        running = false;
                        return;
                    default:
                        System.out.println("Invalid Input, please try again!");
                }            
            }
        } catch (Exception e) {
            System.out.println("An Database error occured!: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
