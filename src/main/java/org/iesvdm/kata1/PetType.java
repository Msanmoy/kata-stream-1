
package org.iesvdm.kata1;

public enum PetType
{
    CAT("🐱"),
    DOG("🐶"),
    HAMSTER("🐹"),
    TURTLE("🐢"),
    BIRD("🐦"),
    SNAKE("🐍");

    private final String emoji;

    PetType(String emoji)
    {
        this.emoji = emoji;
    }

    @Override
    public String toString()
    {
        return this.emoji;
    }

    public static PetType fromEmoji(String searchEmoji)
    {
        for (PetType petType : PetType.values()) {
            if (petType.emoji.equals(searchEmoji)) {
                return petType;
            }
        }
        return null;
    }
}
