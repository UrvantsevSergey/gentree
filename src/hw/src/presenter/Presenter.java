package hw.src.presenter;

import hw.src.model.FamilyTree;
import hw.src.model.Human;
import hw.src.view.View;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamilyTree familyTree;
    private Human human;

    public Presenter(View view, FamilyTree familyTree) {
        this.view = view;
        this.familyTree = familyTree;
    }
    public void addHuman(String name, String gender, LocalDate birthDate, LocalDate deathDate) {
        Human human = new Human(name, gender, birthDate, deathDate);
        familyTree.addHuman(human);
        view.printAnswer("Человек добавлен в дерево.");
    }
    public void printFamilyTree() {
        String answer = familyTree.toString();
        view.printAnswer(answer);
    }
    public void sortByName() {
        familyTree.sortByName();
    }
    public void sortByAge() {
        familyTree.sortByAge();
    }

}
