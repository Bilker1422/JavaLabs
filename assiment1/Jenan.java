

public class Jenan {
    private String name;
    private String capital;
    private float area;
    private int number;

    public Jenan(String name, String capital, float area, int number) {
        this.name = name;
        this.capital = capital;
        this.area = area;
        this.number = number;
    }
    
    public Jenan(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }
    
    public Jenan(String name, String capital, float area) {
        this.name = name;
        this.capital = capital;
        this.area = area;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return
            "name:" + getName() + "\n" +
            "capital: " + getCapital() + "\n" +
            "Area:" + getArea() + "Km^2\n"+
            "number: " + getNumber() + "'";
    }

    
}
