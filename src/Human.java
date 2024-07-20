import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Human> parents;
    private List<Human> children;

    public Human(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() { return name; }
    
    public Gender getGender() { return gender; }

    public void setName() { this.name = name; }

    public void setGender() { this.gender = gender; }

    @Override
    public String toString() {
        return "Имя: " + name + ", пол: " + gender;
    }

}
