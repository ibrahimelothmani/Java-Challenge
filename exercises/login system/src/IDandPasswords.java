import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Ibrahim","1998");
        logininfo.put("Brometheus","PASSWORD");
        logininfo.put("Bro","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
