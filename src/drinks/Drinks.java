package drinks;

/**
 * Created by Dariya on 06.12.2015.
 */
public class Drinks {
    /*private String[] names = {"Bob", "Jill", "Tom", "Brandon","Lila"};
    private int index =(int) Math.random() * names.length;
    private String name = names[index];*/
    private String name;

   /* private String[] tastes={"Cherry","Mango","Banana","Strawberry","Apple" };
    private int index1=(int) Math.random() *tastes.length;
    private String taste=tastes[index1];*/
   private String taste;

    /*private String[] colores={"Green","Red","Yellow","White","Blue","Orange"};
    private int index2= (int) (Math.random()*colores.length);
    private String color=colores[index2];*/
    private String color;

    private int grade;

    public Drinks() {
        this.taste = taste;
        this.name = name;
        this.color = color;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public Drinks setName(String name) {
        this.name = name;
        return this;
    }

    public String getTaste() {
        return taste;
    }

    public Drinks setTaste(String taste) {
        this.taste = taste;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Drinks setColor(String color) {
        this.color = color;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Drinks setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public String toString() {
        return "Drink <<" + name + ">> (" + taste + "," + color +","+grade+ ")";
    }
}
