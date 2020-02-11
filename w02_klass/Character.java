public class Character {
    private int x;
    private int y;

    String slogan = "Hey";

    private String name;
    private CharacterType characterType;
    private Direction direction;

    public Character(String name, CharacterType, characterType){  //constructor
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 40;
    }
    public String toString(){
        return "My name is" + name + " and I am at" + x + " y:" +y + " and my slogan is" + slogan;
    }
}