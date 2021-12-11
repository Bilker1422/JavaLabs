public class Emplotee
{
    private int id;
    private String name , gender;
    private float salary;
    private String email, address, phonenumber;

    public Emplotee(int id, String name, String gender, float salary, String email, String address, String phonenumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String toString() {
        return
        "ID: " + getId() + "\n" +
        "Name: " + getName() + "\n" +
        "Gender: " + getGender() + "\n" +
        "Salary: " + getSalary() + "\n" +
        "Email: " + getEmail() + "\n" +
        "Address: " + getAddress() + "\n" +
        "phonenumber: " + getPhonenumber() + "\n";
    }
}

class Docter extends Emplotee {
    private String rank , specialty;

    public Docter(int id, String name, String gender, float salary, String email, String address, String phonenumber ){
        super(id,name,gender,salary,email,address,phonenumber);
    }
    public Docter(int id, String name, String gender, float salary, String email, String address, String phonenumber,String rank,String specialty ){
        super(id,name,gender,salary,email,address,phonenumber);
        this.rank = rank;
        this.specialty = specialty;
    }
    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return
            "ID: " + getId() + "\n" +
            "Name: " + getName() + "\n" +
            "Gender: " + getGender() + "\n" +
            "Salary: " + getSalary() + "\n" +
            "Email: " + getEmail() + "\n" +
            "Address: " + getAddress() + "\n" +
            "phonenumber: " + getPhonenumber() + "\n" +
            "Rank: " + getRank() + "\n" +
            "Specialty: " + getSpecialty() + "\n" ;
    }
}
class Nurse extends Emplotee{
    private String position;

    public Nurse(int id, String name, String gender, float salary, String email, String address, String phonenumber){
        super(id,name,gender,salary,email,address,phonenumber);
    }
    public Nurse(int id, String name, String gender, float salary, String email, String address, String phonenumber,String position){
        super(id,name,gender,salary,email,address,phonenumber);
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

   @Override
    public String toString() {
        return 
        "ID: " + getId() + "\n" +
        "Name: " + getName() + "\n" +
        "Gender: " + getGender() + "\n" +
        "Salary: " + getSalary() + "\n" +
        "Email: " + getEmail() + "\n" +
        "Address: " + getAddress() + "\n" +
        "phonenumber: " + getPhonenumber() + "\n" +
        "Position: " + getPosition() + "\n" ;
    }

}
class Administrator extends Emplotee{
    private String JobTitle;
    public Administrator(int id, String name, String gender, float salary, String email, String address, String phonenumber){
        super(id,name,gender,salary,email,address,phonenumber);
    }
    public Administrator(int id, String name, String gender, float salary, String email, String address, String phonenumber,String JobTitle){
        super(id,name,gender,salary,email,address,phonenumber);
        this.JobTitle = JobTitle;
    }

    public String getJobTitle() {
        return this.JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    @Override
    public String toString() {
        return
        "ID: " + getId() + "\n" +
        "Name: " + getName() + "\n" +
        "Gender: " + getGender() + "\n" +
        "Salary: " + getSalary() + "\n" +
        "Email: " + getEmail() + "\n" +
        "Address: " + getAddress() + "\n" +
        "phonenumber: " + getPhonenumber() + "\n" +
        "JobTitle: " + getJobTitle() + "\n";
    }

}