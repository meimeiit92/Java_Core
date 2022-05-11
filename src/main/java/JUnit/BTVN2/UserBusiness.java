package JUnit.BTVN2;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Locale;

public class UserBusiness implements IUserBusiness{
    String userName, email, password;

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
    public boolean login(String userNameActual, String passwordAcutal) {
        if(passwordAcutal == password && (userNameActual == userName || userNameActual == email)) return  true;
        return false;
    }
    @Override
    public boolean register(String userName, String email, String password) {
        String userRegex = "^(?=.{8,20}$)(?!.*[ ])[a-zA-Z0-9._]+$";
        String emailRegex = "^(?=.{1,255}$)(?!.*[ ~!?;])[a-zA-Z0-9]+@edu.com.vn$";
        String regexPassword ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,40}$";
        boolean ktUsername = userName.matches(userRegex);
        boolean ktEmail = userName.matches(emailRegex);
        boolean ktPassword = userName.matches(regexPassword);
        if(ktUsername && ktEmail && ktPassword) return true;
        else if (ktUsername == false) {
            throw new RuntimeException("Username khong hop le");

        }
        else if (ktEmail== false) {
            throw new RuntimeException("Email khong hop le");
        }
        else if (ktPassword == false) throw new RuntimeException("Password khong hop le");
        return false;
    }

    public String maHoaPassword(String password){
        String password1 = "DeftBlog";
        String md5Hex = DigestUtils
                .md5Hex(password).toLowerCase();
        System.out.println("Hash: " + md5Hex);
        return  md5Hex;
    }
}
