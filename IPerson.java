import java.time.LocalDate;

public interface IPerson /* Interface */ {
    int getID();
    String getSurname();
    String getName();
    String getGender();
    LocalDate getBirthday();

    void setID(int _id);
    void setSurname(String _surname);
    void setName(String _name);
    void setGender(String _gender);
    void setBirthday(LocalDate _birthday);
}
