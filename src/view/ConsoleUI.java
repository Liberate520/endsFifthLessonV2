package view;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI(){
        scanner = new Scanner(System.in);
        work = true;
        mainMenu = new MainMenu(this);
        presenter = new Presenter();
    }
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Приветствие");
        while (work) {
            System.out.println(mainMenu.printMenu());
            int choice = inputNumMenu();
            if (choice == -1){
                System.out.println("Ошибка ввода");
                continue;
            }
            mainMenu.execute(choice);
        }
    }

    private int inputNumMenu() {
        String line = scanner.nextLine();
        if (!checkLine(line)){
            return -1;
        }
        return Integer.parseInt(line);
    }

    private boolean checkLine(String line) {
        if (!line.matches("[0-9]+")){
            return false;
        }
        int choice = Integer.parseInt(line);
        return choice > 0 && choice <= mainMenu.size();
    }

    public void finish() {
        System.out.println("Приятно было поработать)");
        work = false;
    }

    public void addNote(){
        System.out.println("Укажите время события");
        String time = scanner.nextLine();
        System.out.println("Опишите событие");
        String event = scanner.nextLine();
        presenter.addNote(time, event);
    }

    public void getNote(){
        System.out.println("Укажите событие");
        String event = scanner.nextLine();
        presenter.getNote(event);
    }

    public void getAllNote(){
        presenter.getAllNote();
    }
}
