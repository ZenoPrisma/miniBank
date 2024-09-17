import java.time.LocalDate;

public class Person /*Superklasse*/ {
    private int id;
    protected String surname;
    private String name;
    private String gender;
    private LocalDate birthday;

    //Constructor with only surname
    public Person (String surname) {
        this.surname = surname;
    }

    //Constructor with all Data
    public Person(int id, String surname, String name, String gender, LocalDate birthday) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    //Getter & Setter
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

