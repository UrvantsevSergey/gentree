package hw.src.presenter;

import hw.src.model.FamilyTree;
import hw.src.model.Human;
import hw.src.model.Writer;
import java.io.IOException;
import java.time.LocalDate;

public class Service implements ServiceInterface {
    private FamilyTree familyTree;
    private Human human;

    public void addHuman(String name, String gender, LocalDate birthDate, LocalDate deathDate) {
        Human human = new Human(name, gender, birthDate, deathDate);
        familyTree.addHuman(human);
    }
    public void printFamilyTree() {
        String answer = familyTree.toString();
        System.out.println(answer);
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
