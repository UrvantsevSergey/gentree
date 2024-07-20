import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private LocalDate birthDate, deathDate;
    private List<Human> parents;
    private List<Human> children;

    public Human(String name, Gender gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;// сделать метод который считает разницу в датах в классе localdate
        this.parents = new ArrayList<>();    
        this.children = new ArrayList<>();
    }

}
