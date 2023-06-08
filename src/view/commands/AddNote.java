package view.commands;

import view.ConsoleUI;

public class AddNote implements Command{
    private ConsoleUI consoleUI;

    public AddNote(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Добавить запись";
    }

    @Override
    public void execute() {
        consoleUI.addNote();
    }
}
