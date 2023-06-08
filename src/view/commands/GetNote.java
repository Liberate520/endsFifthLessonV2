package view.commands;

import view.ConsoleUI;

public class GetNote implements Command{
    private ConsoleUI consoleUI;

    public GetNote(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Получить запись";
    }

    @Override
    public void execute() {
        consoleUI.getNote();
    }
}
