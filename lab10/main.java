public class main{
    public static void main(String[] args) {
        Advisor s1= new Advisor(100000,"Yahya","Me");
        Advisor s2= new Advisor(110000,"agasgsag"," 4245");
        Advisorlist list = new Advisorlist();
        list.addAdvisor(s1);
        list.addAdvisor(s2);
        System.out.println("---------------");
        s1.setID(134000);
        list.displayAdvisor();
    }
}