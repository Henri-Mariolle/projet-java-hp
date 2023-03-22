import java.util.Random;

public class Wizard {
    String name;
    String surname;
    String gender;
    int age;
    House house;
    String quality;

    public Wizard(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age=age;
        House house=House.getRandom();
        this.house= house;


    }

}
