import java.util.List;

public class Human {
    private int id;
    private String name;
    private Gender gender;
    //private LocalDate birthDate, deathDate;
    private List<Human> parents;
    private List<Human> children;
    /** Создания поля класса Human */
    public Human(String name, Gender gender) {
        this.id = (int) IdGenerator.generateId();
        this.name = name;
        this.gender = gender;
    }
    /**Сеттеры/геттеры */
    public int getId() { return id; }
    public String getName() { return name; }
    public Gender getGender() { return gender; }
    public void setName() { this.name = name; }
    public void setGender() { this.gender = gender; }
    public void setId(int id) { this.id = id; }
    /**Метод для печати поля класса Human */
    @Override
    public String toString() {
        return "ID: " + id + " Имя: " + name + ", пол: " + gender;
    }

}
