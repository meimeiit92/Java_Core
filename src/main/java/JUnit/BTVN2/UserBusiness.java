package JUnit.BTVN2;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Locale;
import java.util.regex.Pattern;

public class UserBusiness implements IUserBusiness{
    String userName, email, password;
    private final String patternUserName = "^[a-zA-Z_]([_a-zA-Z0-9]){0,19}$";
    private final String patternPassword = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[#$&*])[\\w#$&*]{8,40}$";
    private final String patternEmail = "[\w]+@[\w]{1,252}+.edu.com.vn";
    final  Pattern ptUserName = Pattern.compile(patternUserName);
    final  Pattern ptPassword = Pattern.compile(patternPassword);
    final  Pattern ptEmail = Pattern.compile(patternEmail);
    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        String userRegex = "^(?=.{8,20}$)(?!.*[\\\\s])[a-zA-Z0-9._]+$";
        if(userName != null){
            boolean ktUsername = userName.matches(userRegex);
            if (ktUsername == false) {
                throw new RuntimeException("Username khong hop le");

            }
        }
        else throw new RuntimeException("User = null");
        this.userName = userName;
    }

    public void setEmail(String email) {
        String emailRegex = "^(?=.{1,255}$)(?!.*[ ~!?;])[a-zA-Z0-9]+@bkacad.edu.com.vn$";
        if(email!=null){
            boolean ktEmail = email.matches(emailRegex);
            if (ktEmail== false) {
                throw new RuntimeException("Email khong hop le");
            }
        }
        else throw new RuntimeException("Email = null");
        this.email = email;
    }

    public void setPassword(String password) {
        String regexPassword ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,40}$";
        if(password!=null){
            boolean ktPassword = password.matches(regexPassword);
            if (ktPassword== false) {
                throw new RuntimeException("Password khong hop le");
            }
        }
        else throw new RuntimeException("Password = null");
        this.password = password;
    }

    public UserBusiness() {
    }

    @Override
    public boolean login(String user, String password, String md5Pw) {

      if(user.trim().isEmpty()){
          System.out.println("User khong duoc de trong");
          return false;
      }
      if (password.trim().isEmpty()){
          System.out.println("Password khong duoc de trong");
          return false;
      }
      // Kiem tra xem co hop le hay khong


        if(!ptUserName.matcher(user).matches() && !ptEmail.matcher(user).matches()){
            System.out.println("sai ten tai khoan hoac email");
            return false;
        }
        if(ptUserName.matcher(user).matches()|| ptEmail.matcher(user).matches()){
            if(ptPassword.matcher(password).matches()){
                // can them 1 buoc de ma hoa mat khau
                if(DigestUtils.md5Hex(password).toLowerCase(Locale.ROOT).equals(md5Pw)){
                    System.out.println("Sai ten tai khoan hoac email sai dinh dang");
                    return true;
                }
                else {
                    System.out.println("Mat khau khong dung");
                    return false;
                }
            }
            else {
                System.out.println("Mat khau sai dinh dang");
            }
        }
        return  false;
    }
    @Override
    public boolean register(String userName, String email, String password) {
        boolean flag1 = false, flag2 = false, flag3=false;
        if(userName.trim().isEmpty()){
            System.out.println("Username khong hop le");
            return false;
        }
        else if (ptUserName.matcher(userName).matches()){
            flag1 = true;

        }
          if(email.trim().isEmpty()){
            System.out.println("Email khong hop le");
            return false;
        }
        else if (ptEmail.matcher(email).matches()){
            flag2 = true;

        }
        if(password.trim().isEmpty()){
            System.out.println("Password khong hop le");
            return false;
        }
        else if (ptPassword.matcher(password).matches()){
            flag3 = true;

        }
        if(flag1&&flag2&&flag3) return true;
        return false;
    }


}
