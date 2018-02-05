package trolls;

import goats.IGoat;

/**
 * @author Liang,Yu(yxl5521)
 */
public class BattleTroll implements ITroll {

    private int HP;
    private IGoat goat;
    private boolean active=true;

    /**
     * the constructor for BattleTroll
     * @param HP the blood pool that troll has
     */
    public BattleTroll(int HP){
        this.HP=HP;
    }

    /**
     * damage the troll while interact with it
     * @param goat the goat that damage him
     */
    public void interact(IGoat goat){
        this.goat=goat;

        System.out.println(goat.approach());
        adjustPower(goat.impact());

    }

    /**
     * decrease the troll's HP
     * @param num the amount to increase/decrease
     */
    public void adjustPower(int num){
        HP-=num;
        System.out.println("A troll stands guard.");
        if (HP>0){
            goat.setActive(false);
            System.out.println("The troll eats "+goat.toString());
        }
        else {
            goat.setActive(false);
            this.active=false;
        }
    }

    /**
     * print the last word for troll
     * @param goat the goat that kills the troll
     */
    public void finished(IGoat goat){
        System.out.println("The troll is vanquished by "+goat.toString());

    }

    /**
     * if the troll is active
     * @return true if it is active, false otherwise
     */
    public boolean isActive(){
        return this.active;
    }
}
