public abstract class PlayerCharacter {
    protected String name;
    protected int str;
    protected int intellij;
    protected int agl;

    protected int hp, hpMax;
    protected int mp, mpMax;

    private static int count;

    public PlayerCharacter(){

        System.out.println("PlayerCharacter extended class created.");
        count++;
        System.out.println(count);
    }

    public void showStats(){}

    public static int numCharacters(){
        return count;
    }
}

