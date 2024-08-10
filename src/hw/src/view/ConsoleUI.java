package hw.src.view;

import hw.src.presenter.Presenter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements hw.src.view.View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI() {
        this.scanner = scanner;
        this.presenter = presenter;
        this.work = true;
    }

    public void start() {
        System.out.println("Выберите пункт меню");
        while (work) {
            System.out.println("1. Внести запись в дерево");
            System.out.println("2. Вывести дерево людей на экран");
            System.out.println("3. Отсортировать дерево по имени");
            System.out.println("4. Отсортировать дерево по возрасту");
            System.out.println("5. Выйти");
            String choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    addHumans();
                    break;
                case "2":
                    presenter.printFamilyTree();
                    break;
                case "3":
                    presenter.sortByName();
                    break;
                case "4":
                    presenter.sortByAge();
                    break;
                case "5":
                    work = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        }
    }
    public void addHumans() {
        System.out.println("Введите имя: ");
        String inputName = scanner.nextLine();
        System.out.println("Введите пол (Male, Female): ");
        String inputGender = scanner.nextLine();
        System.out.println("Введите дату рождения (yyyy-MM-dd): ");
        LocalDate inputBirthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Введите дату смерти (yyyy-MM-dd): ");
        LocalDate inputDeathDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (inputDeathDate != null) {
            presenter.addHuman(inputName, inputGender, inputBirthDate, inputDeathDate);
        }
        else {
            presenter.addHuman(inputName, inputGender, inputBirthDate, LocalDate.now());
        }
    }

    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
