package trolls;

import goats.IGoat;

public class CuteTroll implements ITroll {
    private int maxHappy;
    private IGoat goat;
    private boolean active=true;
    private int happy;
    public CuteTroll(int maxHappy){
        this.maxHappy=maxHappy;
    }
    public void interact(IGoat goat){
        this.goat=goat;
        System.out.println(goat.approach());
        adjustPower(goat.impact());
    }
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
    public void finished(IGoat goat){
        System.out.println("The troll was too happy and fall asleep because of "+goat.toString());
    }
    public boolean isActive(){
        return this.active;
    }
}
