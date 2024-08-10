package hw.src.view;

import hw.src.presenter.Presenter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConsoleUI implements hw.src.view.View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
    }

    public void start() throws IOException, ClassNotFoundException {
        System.out.println("Выберите пункт меню");
        while (work) {
            System.out.println("1. Внести запись в дерево");
            System.out.println("2. Вывести дерево людей на экран");
            System.out.println("3. Отсортировать дерево по имени");
            System.out.println("4. Отсортировать дерево по возрасту");
            System.out.println("5. Загрузить дерево из файла");
            System.out.println("6. Сохранить дерево в файл");
            System.out.println("7. Выйти");
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
                    presenter.loadFromFile();
                    break;
                case "6":
                    presenter.saveToFile();
                    break;
                case "7":
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
        System.out.println("Введите дату смерти (yyyy-MM-dd) или NO если её нет: ");
        String date = scanner.nextLine();
        // LocalDate inputDeathDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        if (!"NO".equals(date)) {
            LocalDate inputDeathDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
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
