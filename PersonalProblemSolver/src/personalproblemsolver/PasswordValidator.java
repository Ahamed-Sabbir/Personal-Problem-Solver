package personalproblemsolver;
public class PasswordValidator {
    private String pass;
    PasswordValidator(String pass){
        this.pass = pass;
    }
    boolean validate(){
        boolean f = true;
        boolean up = false, lo = false, di = false;
        for(int i = 0; i < pass.length(); i++){
            if((pass.charAt(i) >= 'A' && pass.charAt(i)<='Z') || (pass.charAt(i)>='a' && pass.charAt(i)<='z') || (pass.charAt(i)>=48 && pass.charAt(i)<=57)){
                if((pass.charAt(i) >= 'A' && pass.charAt(i)<='Z')) up = true;
                else if((pass.charAt(i)>='a' && pass.charAt(i)<='z')) lo = true;
                else if((pass.charAt(i)>=48 && pass.charAt(i)<=57)) di = true;
            }
            else{
                f = false;
                break;
            }
        }
        if(!f) return false;
        else if(f && up && lo && di){
            if((pass.length()>=6 && pass.length()<=32))return true;
        }
        return false;
    }
}
