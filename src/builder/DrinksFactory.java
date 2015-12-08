package builder;

import drinks.Drinks;

/**
 * Created by Dariya on 06.12.2015.
 */
public class DrinksFactory {
    public Drinks getDrinks(DrinksType drinksType){
        DrinksBuilder builder=drinksType.getBuilder();
        builder.createDrinks();
        builder.buildName();
        builder.buildTaste();
        builder.buildColor();
        builder.buildGrade();
        return builder.getDrinks();
    }
}
