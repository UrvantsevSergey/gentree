import java.time.LocalDate;
import java.time.Period;
import java.io.Serializable;

public class Human implements Serializable {
    private int id;
    private String name;
    private Gender gender;
    private int age;
    private Parrents parrents;
    private Children children;

    /** Создания поля класса Human */
    public Human(String name, Gender gender, LocalDate birthDate, LocalDate Date) {
        this.id = (int) IdGenerator.generateId();
        this.name = name;
        this.gender = gender;
        this.age = calculateAge(birthDate, Date);
        this.parrents = parrents;
        this.children = children;
    }
    /**Сеттеры/геттеры */
    public int getId() { return id; }
    public String getName() { return name; }
    public Gender getGender() { return gender; }
    public void setName() { this.name = name; }
    public void setGender() { this.gender = gender; }
    public void setId(int id) { this.id = id; }
    public Parrents getParrent () { return parrents; }
    public Parrents setParrent (Parrents parrents) { return this.parrents = parrents; }
    public Children getChild () { return children; }
    public Children setChild (Children children) { return this.children = children; }
    /**Метод для печати поля класса Human */
    @Override
    public String toString() {
        return "ID: " + id + " Имя: " + name + ", пол: " + gender + " " + age + " лет" + ", Родители: " + parrents + " Дети: " + children;
    }
    public static int calculateAge(LocalDate birthDate, LocalDate Date) {
        return Period.between(birthDate, Date).getYears();
    }
}
