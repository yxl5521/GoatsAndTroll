package trolls;

import goats.IGoat;
import queues.LinkedQueue;

public class BattleTroll implements ITroll {
    private int HP;
    private IGoat goat;
    private boolean active=true;
    public BattleTroll(int HP){
        this.HP=HP;
    }
    public void interact(IGoat goat){
        this.goat=goat;

        System.out.println(goat.approach());
        adjustPower(goat.impact());

    }
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
    public void finished(IGoat goat){
        System.out.println("The troll is vanquished by "+goat.toString());

    }
    public boolean isActive(){
        return this.active;
    }
}
