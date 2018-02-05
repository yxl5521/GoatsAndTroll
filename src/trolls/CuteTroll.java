package trolls;

import goats.IGoat;

/**
 * @author Liang,Yu(yxl5521)
 */

public class CuteTroll implements ITroll {
    private int maxHappy;
    private IGoat goat;
    private boolean active=true;
    private int happy;

    /**
     * the constructor for the cute troll
     * @param maxHappy the max happiness
     */
    public CuteTroll(int maxHappy){
        this.maxHappy=maxHappy;
    }

    /**
     * damage the troll while interact with the troll
     * @param goat the goat to interact with the troll
     */
    public void interact(IGoat goat){
        this.goat=goat;
        System.out.println(goat.approach());
        adjustPower(goat.impact());
    }

    /**
     * raise the troll's happiness
     * @param num the amount to increase
     */
    public void adjustPower(int num){
        happy+=num;
        System.out.println("A troll stands guard.");
        if (happy>=maxHappy){
            this.active=false;
        }
        else {
            System.out.println("The troll pets "+goat.toString());
        }
    }

    /**
     * print out the last word for the troll
     * @param goat the goat that let troll sleep
     */
    public void finished(IGoat goat){
        System.out.println("The troll was too happy and fall asleep because of "+goat.toString());
    }

    /**
     * whether the troll is active
     * @return true if it is, otherwise false.
     */
    public boolean isActive(){
        return this.active;
    }
}
