package tech.codoverse;

public class FacebookLogin implements CanLogin {

    @Override
    public void login() {
        IO.print("Facebook login.");
    }

}
