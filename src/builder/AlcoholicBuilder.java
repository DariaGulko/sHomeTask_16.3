package builder;

/**
 * Created by Dariya on 06.12.2015.
 */
public class AlcoholicBuilder extends DrinksBuilder {

    @Override
    void buildName() {
        String[] names = {"Emy", "Jill", "Tom", "Brandon", "Lila"};
        int index = (int) Math.random() * names.length;
        drinks.setName(names[index]);
    }

    @Override
    void buildColor() {
        String[] colors = {"Green", "Red", "Yellow", "White", "Blue", "Orange"};
        int index2 = (int) (Math.random() * colors.length);
        drinks.setColor(colors[index2]);
    }

    @Override
    void buildTaste() {
        String[] tastes = {"Cherry", "Mango", "Banana", "Strawberry", "Apple"};
        int index1 = (int) Math.random() * tastes.length;
        drinks.setTaste(tastes[index1]);
    }

    @Override
    void buildGrade() {
        drinks.setGrade((int) Math.random() * 80);
    }


}
