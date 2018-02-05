package trolls;

import goats.IGoat;

/**
 * @author Liang,Yu(yxl5521)
 */
public interface ITroll {
    /**
     * damage the troll while goat interact with it
     * @param goat the goat that damage him
     */
    void interact(IGoat goat);

    /**
     * adjust the power that troll has
     * @param num the amount to increase/decrease
     */
    void adjustPower(int num);

    /**
     * print out the last word when finish
     * @param g the goat that defeated the troll
     */
    void finished(IGoat g);

    /**
     * if the troll is still active
     * @return true for active, false otherwise
     */
    boolean isActive();
}
