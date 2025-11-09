package tech.codoverse;

public class PasswordCheck {

    // ^((?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[[:punct:]])).{8,}$
    public static void main(String[] args) {
        var app = new PasswordCheck();

        System.out.println(app.checkPassword("strong"));
        System.out.println(app.checkPassword("password"));
        System.out.println(app.checkPassword("Password"));
        System.out.println(app.checkPassword("Password123"));
        System.out.println(app.checkPassword("P@ssword123"));
    }

    public String checkPassword(String password) {

        int strength = 0;

        if (checkLength(password))
            strength++;

        if (existDigit(password))
            strength++;

        if (existUpper(password))
            strength++;

        if (existLower(password))
            strength++;

        if (existSymbol(password))
            strength++;

        String result = null;

        if (strength <= 3)
            result = "Weak";
        else if (strength <= 4)
            result = "Medium";
        else
            result = "Strong";

        return result;
    }

    public boolean checkLength(String password) {
        return password.length() >= 8;
    }

    public boolean existDigit(String password) {
        for (var c : password.toCharArray()) {
            if(c >= 48 && c <= 57)
                return true;
        }
        return false;
    }

    public boolean existUpper(String password) {
        for (var c : password.toCharArray()) {
            if(c >= 65 && c <= 90)
                return true;
        }
        return false;
    }

    public boolean existLower(String password) {
        for (var c : password.toCharArray()) {
            if(c >= 97 && c <= 122)
                return true;
        }
        return false;
    }

    public boolean existSymbol(String password) {
        for (var c : password.toCharArray()) {
            if((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126))
                return true;
        }
        return false;
    }

}
