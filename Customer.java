import java.time.LocalDate;

public class Customer extends Person implements IPerson {
    private Account account;

    public Customer(int id, String surname, String name, String gender, LocalDate birthday, Account account) {
        super(id, surname, name, gender, birthday);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void printAccountdata() {
        System.out.println("Customer: " + getName() + " " + getSurname());
        System.out.println("Gender: " + getGender());
        System.out.println("Birthday: " + getBirthday());
        if (account != null) {
            System.out.println("Accountnumber: " + account.getAccountNumber());
            System.out.println("Accountbalance: " + account.getBalance() + "$");
        } else {
            System.out.println("No Account Available");
        }
    }
}
