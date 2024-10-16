import java.util.ArrayList;
import java.util.List;

class TextEditor {
    private final CharacterFactory characterFactory;
    private final List<Character> document;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
        this.document = new ArrayList<>();
    }

    public void insertText(String text, String font, int size) {
        for (char ch : text.toCharArray()) {
            Character character = characterFactory.getCharacter(ch, font, size);
            document.add(character);
        }
    }

    public void render() {
        for (int i = 0; i < document.size(); i++) {
            System.out.println(document.get(i).render(i));
        }
    }
}
