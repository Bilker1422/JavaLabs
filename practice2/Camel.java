
public class Camel {
    private String Name;
    private String Color;
    private String Diet;

    public Camel(String Name, String Color, String Diet) {
        this.Name = Name;
        this.Color = Color;
        this.Diet = Diet;
    }
    public Camel( String Color, String Diet) {
        this.Color = Color;
        this.Diet = Diet;
    }
    public void Race(){

    }

    public void camel_details(){
        System.out.println("Camel name: "+ Name +"\n");
        System.out.println("Camel colour: "+ Color +"\n");
        System.out.println("Camel can eat: "+ Diet +"\n");
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDiet() {
        return this.Diet;
    }

    public void setDiet(String Diet) {
        this.Diet = Diet;
    }

}

class Wild_camel extends Camel{
    public Wild_camel(String Color, String Diet){
        super(Color, Diet);
    }
    public void more_details(){
        System.out.println("Camel name: "+ getName());
        System.out.println("Camel colour: "+ getColor());
        System.out.println("Camel can eat: "+ getDiet());
        System.out.println("---------------------------");
        System.out.println("Beware: The Wild Camel could be dangerous, It can Hurt you badly");
    }
}

class Racer_camel extends Camel{

    private String Owner;
    private int Races;

    public Racer_camel(String Name ,String Color, String Diet,String Owner, int Races){
        super(Name,Color, Diet);
        this.Owner = Owner;
        this.Races = Races;
    }
    public void more_details(){
        System.out.println("Camel name: "+ getName());
        System.out.println("Camel colour: "+ getColor());
        System.out.println("Camel can eat: "+ getDiet());
        System.out.println(getName() + " is racer and won "+ Races + " races until now");
    }
}
