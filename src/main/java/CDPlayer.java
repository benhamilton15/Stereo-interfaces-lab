import java.util.ArrayList;

public class CDPlayer extends Component{

    ArrayList<CD> cDDock;
    CD currentCD;

    public CDPlayer(){
        this.cDDock = new ArrayList<CD>();
        this.currentCD = null;
    }

    public void addCD(CD cd) {
        if (cDDock.size() < 3) {
            this.cDDock.add(cd);
        }
    }

    public String getCurrentCD(){
       return this.currentCD.getName();
    }


    public void changeCD(int cDPosition){
        cDPosition -= 1;

        this.currentCD = this.cDDock.get(cDPosition);
    }

    public int cDCount() {
        return this.cDDock.size();
    }
}
