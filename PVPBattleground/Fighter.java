import java.util.Random;

public class Fighter extends PlayerCharacter {

    private int con;

    public Fighter (String newName){
        name = newName;
        System.out.println("A Fighter named "+newName +" has been created!");
        Random rand = new Random();
        str = 15 + (rand.nextInt(6)+1);
        agl = 8 + (rand.nextInt(6)+1);
        intellij = 7 + (rand.nextInt(6)+1);
        con = 10 + (rand.nextInt(6)+1);

        hp = hpMax = (str*2)+(2*con);
        mp = mpMax= 0;
    }

    public void showStats(){
        System.out.println("The Stats for player: "+name);
        System.out.println("Your fighter has been created with:\nStrength - "+str+"\nAgility - "+agl+"\nIntelligence - "+intellij+"\nConstitution - "+con+"\nHP - "+hp+"/"+hpMax+"\nMP - "+mp+"/"+mpMax+"\n\n");

    }

}

