import builder.DrinksFactory;
import builder.DrinksType;
import drinks.Drinks;

/**
 * Created by Dariya on 06.12.2015.
 */
public class Main {
    public static void main(String[] args) {

        DrinksFactory drinksFactory=new DrinksFactory();
        Drinks drink1=drinksFactory.getDrinks(DrinksType.ALCOHOLIC);
        System.out.println("First drink is "+ drink1.toString());
        Drinks drink2=drinksFactory.getDrinks(DrinksType.NON_ALCOHOLIC);
        System.out.println("Second drink is "+ drink2.toString());
        Drinks drink3=drinksFactory.getDrinks(DrinksType.ALCOHOLIC);
        System.out.println("First drink is "+ drink3.toString());

    }
}
