package presenter;

public class Presenter {
    public void addNote(String time, String event) {
        System.out.println("Добавление записи");
    }

    public void getNote(String event) {
        System.out.println("получение одной записи");
    }

    public void getAllNote() {
        System.out.println("Получение всех записей");
    }
}
