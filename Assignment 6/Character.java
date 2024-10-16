class Character {
    private final char charValue;
    private final String font;
    private final int size;

    public Character(char charValue, String font, int size) {
        this.charValue = charValue;
        this.font = font;
        this.size = size;
    }

    public String render(int position) {
        return String.format("Rendering '%c' at position %d with font '%s' and size %d",
                charValue, position, font, size);
    }
}
