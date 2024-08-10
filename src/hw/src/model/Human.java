package hw.src.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Human implements Serializable, FamilyTreeItem<Human>{
    private int id;
    private String name;
    private String gender;
    private int age;


    /** Создания поля класса Human */
    public Human(String name, String gender, LocalDate birthDate, LocalDate Date) {
        this.id = (int) IdGenerator.generateId();
        this.name = name;
        this.gender = gender;
        this.age = calculateAge(birthDate, Date);

    }
    /**Сеттеры/геттеры */
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(int id) { this.id = id; }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "ID: " + id + " Имя: " + name + ", пол: " + gender + " " + age + " лет";
    }

    public 
    /**Метод для печати поля класса Human */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human other = (Human) obj;
        return this.id == other.id &&
            this.name.equals(other.name) &&
            this.gender == other.gender &&
            this.age == other.age;
    }
    private int calculateAge(LocalDate birthDate, LocalDate Date) {
        return Period.between(birthDate, Date).getYears();
    }
    @Override
    public int compareTo(Human o) {
        return name.compareTo(o.name);
    }
}
