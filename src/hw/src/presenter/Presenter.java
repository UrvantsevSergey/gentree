package hw.src.presenter;

import hw.src.model.FamilyTree;
import hw.src.model.Human;
import hw.src.model.Writer;
import hw.src.view.View;
import java.io.IOException;
import java.time.LocalDate;

public class Presenter {
    private View view;
    private FamilyTree familyTree;
    private Human human;

    public Presenter(View view) {
        this.view = view;
        familyTree = new FamilyTree<>();
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
    public void saveToFile() throws IOException {
        Writer writer = new Writer(familyTree);

        writer.saveinFile("family_tree.csv");
        System.out.println("Сохранено в файл.");
    }
    public void loadFromFile() throws ClassNotFoundException, IOException {
        Writer writer = new Writer(familyTree);
        writer.readFromFile("family_tree.csv");
        System.out.println("Загружено из файла.");

        FamilyTree loadtree = writer.getFamilyTree();
        System.out.println(loadtree);
    }

}
