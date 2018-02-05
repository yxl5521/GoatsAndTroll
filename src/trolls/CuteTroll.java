package trolls;

import goats.IGoat;

public class CuteTroll implements ITroll {
    private int maxHappy;
    private IGoat goat;
    private boolean active=true;
    public CuteTroll(int maxHappy){
        this.maxHappy=maxHappy;
    }
    public void interact(IGoat goat){
        this.goat=goat;
    }
    public void adjustPower(int num){
        maxHappy=num;
    }
    public void finished(IGoat goat){
        this.goat=goat;
    }
    public boolean isActive(){
        return active;
    }
}
