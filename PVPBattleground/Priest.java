import java.util.Random;

public class Priest extends PlayerCharacter{


    int cha;

    public Priest (String newName){
        name = newName;
        System.out.println("A Priest named "+newName +" has been created!");
        Random rand = new Random();
        str = 7 + (rand.nextInt(6)+1);
        agl = 8 + (rand.nextInt(6)+1);
        intellij = 15 + (rand.nextInt(6)+1);
        cha = 10 + (rand.nextInt(6)+1);

        hp = hpMax = str;
        mp = mpMax= intellij + (2*cha);
    }

    public void showStats(){
        System.out.println("The Stats for player: "+name);
        System.out.println("Your Priest has been created with:\nStrength - "+str+"\nAgility - "+agl+"\nIntelligence - "+intellij+"\nCharisma - "+cha+"\nHP - "+hp+"/"+hpMax+"\nMP - "+mp+"/"+mpMax+"\n\n");

    }

}



