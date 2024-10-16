public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        TextEditor textEditor = new TextEditor(characterFactory);

        String text = "This is a test of rendering. ";
        textEditor.insertText(text, "Arial", 12);
        textEditor.insertText("This is another sentence.", "Arial", 12);

        textEditor.render();
    }
}
