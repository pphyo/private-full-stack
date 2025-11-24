package tech.codoverse;

public class GoogleLogin implements CanLogin {

    @Override
    public void login() {
        IO.println("Google login.");
    }

}
