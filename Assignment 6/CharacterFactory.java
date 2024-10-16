import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private final Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char charValue, String font, int size) {
        String key = charValue + "|" + font + "|" + size;
        if (!characters.containsKey(key)) {
            characters.put(key, new Character(charValue, font, size));
            System.out.println("Creating new character: " + key);
        }
        return characters.get(key);
    }
}
