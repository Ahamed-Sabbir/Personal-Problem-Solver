package personalproblemsolver;
import java.io.File;
import java.util.Scanner;
public class LoginCompare {
    String userid, password;
    LoginCompare(String userid, String password){
        this.userid = userid;
        this.password = password;
    }
    
    boolean compare(){
        int count = 0;
        try{
            File f = new File("loginInfo.txt");
            Scanner input = new Scanner(f);
            String check;
            while(input.hasNext()){
                check = input.nextLine();
                if(check.equals(userid) == true && (count%2)==0){
                    count++;
                }
                else if(check.equals(password) == true && (count%2)==1){
                    count++;
                }
            }
            if(count >= 2) return true;
        }
        catch(Exception ex){
            return false;
        }
        return false;
    }
}
