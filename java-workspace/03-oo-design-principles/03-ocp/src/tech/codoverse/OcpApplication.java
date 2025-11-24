package tech.codoverse;

public class OcpApplication {

    void main() {
        launch();
    }

    void launch() {
        IO.println();

        IO.println("""
                1. Email Login
                2. Google Login
                3. Facebook Login
                """);

        int loginMethod = Integer.parseInt(IO.readln("Choose your login method: "));

        IO.println();

        LoginController controller;

        switch (loginMethod) {
            case 1:
                controller = new LoginController(new EmailLogin());
                controller.login();
                break;
            case 2:
                controller = new LoginController(new GoogleLogin());
                controller.login();
                break;
            case 3:
                controller = new LoginController(new FacebookLogin());
                controller.login();
                break;
            default:
                IO.println("Please choose correct login method.");
        }

        IO.println();
    }

}
