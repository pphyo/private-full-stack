package tech.codoverse;

public class EmailLogin implements CanLogin {

    @Override
    public void login() {
        IO.println("Email login.");
    }

}
