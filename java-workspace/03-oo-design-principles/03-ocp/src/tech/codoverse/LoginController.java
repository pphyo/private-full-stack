package tech.codoverse;

public class LoginController {

    private CanLogin login;

    public LoginController(CanLogin login) {
        this.login = login;
    }

    public void login() {
        login.login();
    }

}
