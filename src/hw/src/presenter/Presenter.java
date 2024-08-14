package hw.src.presenter;

import hw.src.view.View;
import java.io.IOException;

public class Presenter{
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }
    public void addHuman() {
        service.addHuman(null, null, null, null);
        view.printAnswer("Человек добавлен в дерево.");
    }
    public void printFamilyTree() {
        service.printFamilyTree();
    }
    public void sortByName() {
        service.sortByName();
    }
    public void sortByAge() {
        service.sortByAge();
    }
    public void saveToFile() throws IOException {
        service.saveToFile();
    }
    public void loadFromFile() throws ClassNotFoundException, IOException {
        service.loadFromFile();
    }

}
