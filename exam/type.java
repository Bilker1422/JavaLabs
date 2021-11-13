import javax.print.attribute.SetOfIntegerSyntax;

public class type
{
    private String name;
    private String date;
    private int speed;
    private int miles;

    public type(String name, String date, int speed, int miles)
    {
        this.name = name;
        this.date = date;
        this.speed = speed;
        this.miles = miles;
    }

    public void setname(String name)
    {
        this.name = name;
    }
    public void setdate(String date)
    {
        this.date = date;
    }
    public void setspeed(int speed)
    {
        this.speed = speed;
    }
    public void setmiles(int miles)
    {
        this.miles = miles;
    }
    public String getname()
    {
        return this.name;
    }
    public String getdate()
    {
        return this.date;
    }
    public int getspeed()
    {
        return this.speed;
    }
    public int getmiles()
    {
        return this.miles;
    }
}