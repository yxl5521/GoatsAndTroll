package trolls;

import goats.IGoat;
import queues.LinkedQueue;

public class BattleTroll implements ITroll {
    private int HP;
    private IGoat goat;
    private LinkedQueue que;
    private boolean active=true;
    public BattleTroll(int HP){
        this.HP=HP;
    }
    public void interact(IGoat goat){
        this.goat=goat;

        goat.approach();
        HP-=goat.impact();

    }
    public void adjustPower(int num){
        num=HP;
        System.out.println("A troll stands guard.");
        if (num>0){
            goat.setActive(false);
            que.dequeue();
            System.out.println("The troll eats"+goat.toString());
        }
        else {
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
