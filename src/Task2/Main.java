package Task2;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.save(editor.save());

        editor.type(", world!");
        history.save(editor.save());

        System.out.println("Current text: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After the cancellation: " + editor.getText());

        editor.restore(history.undo());
        System.out.println("After the second cancellation: " + editor.getText());
    }
}