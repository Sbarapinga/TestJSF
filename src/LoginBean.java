import javax.faces.bean.ManagedBean;

/**
 * Created by pavel on 16.04.17.
 */

@ManagedBean
public class LoginBean {
    private String login;
    private String pass;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean doLogin() {
        return true;
    }
}
