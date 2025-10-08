package tech.codoverse;

public class PalindromeApplication {

    public static void main(String[] args) {
        var app = new PalindromeApplication();
        System.out.println(app.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(app.isPalindrome("race a car"));
        System.out.println(app.isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {

        if (isWhiteSpace(s)) {
            return true;
        }

        String original = getPureString(s);
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i --) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse))
            return true;

        return false;
    }

    public String getPureString(String s) {
        StringBuilder sb = new StringBuilder();

        for (var c : s.toCharArray()) {
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                sb.append(c);
        }
        return sb.toString().toLowerCase();
    }

    public boolean isWhiteSpace(String s) {
        for (var c : s.toCharArray())
            if(c > 32) return false;

        return true;
    }

}