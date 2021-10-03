public class book 
{
    private int BookID;
    private String name;
    private int total;
    
    public book(int BookID, String name, int total)
    {
        this.BookID= BookID;
        this.name = name;
        this.total = total;
    }

    public void setBookID(int BookID)
    {
        this.BookID = BookID;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void settotal(int total)
    {
        this.total = total;
    }

    public int getBookID()
    {
        return this.BookID;
    }
    public String getname()
    {
        return this.name;
    }
    public int gettotal()
    {
        return this.total;
    }


    public void DisplayInfo()
    {
        System.out.printf("Full Infoomation about %s\n",this.name);
        System.out.println(this.BookID);
        System.out.println(this.total);
        System.out.println("Thanks u for visit our library.");
    }
    
}