package builder;

import drinks.Drinks;

/**
 * Created by Dariya on 06.12.2015.
 */
public abstract class DrinksBuilder {
    protected Drinks drinks;

    public Drinks getDrinks() {
        return drinks;
    }
    public  void createDrinks(){
        drinks=new Drinks();
    }
    abstract void buildName();
    abstract void buildColor();
    abstract void buildTaste();
    abstract void buildGrade();
}
