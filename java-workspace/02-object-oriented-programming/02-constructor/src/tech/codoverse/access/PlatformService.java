package tech.codoverse.access;

public class PlatformService {

    public String publicVar = "Public Var";
    protected String protectedVar = "Protected Var";
    String defaultVar = "Default Var";
    // private String privateVar = "Private Var";

    public void executePublic() {
        System.out.println("Public Method");
    }

    protected void executeProtected() {
        System.out.println("Protected Method");
    }

    void executeDefault() {
        System.out.println("Default Method");
    }

    // private void executePrivate() {
    //     System.out.println("Private Method" + privateVar);
    // }

}