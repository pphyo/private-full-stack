package tech.codoverse.access;

public class AppService {

    private PlatformService pfService = new PlatformService();

    public void launch() {
        System.out.println(pfService.publicVar);
        System.out.println(pfService.protectedVar);
        System.out.println(pfService.defaultVar);

        System.out.println();

        pfService.executePublic();
        pfService.executeProtected();
        pfService.executeDefault();
    }

}
