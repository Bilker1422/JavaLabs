public class Person{
    
    protected int ID;
    protected String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }


    protected int getID() {
        return this.ID;
    }

    protected void setID(int ID) {
        this.ID = ID;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("ID: \t"+ ID);
        System.out.println("name: \t"+ name);
    }

}