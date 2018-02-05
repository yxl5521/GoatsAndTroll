package trolls;

import goats.IGoat;

public interface ITroll {
    void interact(IGoat goat);
    void adjustPower(int num);
    void finished(IGoat g);
    boolean isActive();
}
