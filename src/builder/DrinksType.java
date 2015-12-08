package builder;

/**
 * Created by Dariya on 07.12.2015.
 */
public enum DrinksType {

    ALCOHOLIC{
        {
            this.builder=new AlcoholicBuilder();
        }
    },
    NON_ALCOHOLIC{
        {
            this.builder=new NonAlcoholicBuilder();
        }
    };
    protected  DrinksBuilder builder;

    public DrinksBuilder getBuilder() {
        return builder;
    }
}
