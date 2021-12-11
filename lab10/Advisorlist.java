import java.util.ArrayList;

public class Advisorlist{
    private ArrayList<Advisor> advisorlist ;

    public Advisorlist() {
        advisorlist = new ArrayList();
    }
    public void addAdvisor(Advisor advisor){
        advisorlist.add(advisor);
    }
    public void displayAdvisor(){
        for (Advisor s: advisorlist){
            s.display();
        }
    }
    public Advisor search (int id){
        Advisor targetAdvisor = null; 
        for (Advisor s: advisorlist){
            if(s.getID() ==  id) {
                targetAdvisor = s; 
                break;
            }
        }
        return targetAdvisor;
    }
    public Advisor search (String name){
        Advisor targetAdvisor = null; 
        for (Advisor s: advisorlist){
            if(s.getName() ==  name) {
                targetAdvisor = s; 
                break;
            }
        }
        return targetAdvisor;
    }
}
