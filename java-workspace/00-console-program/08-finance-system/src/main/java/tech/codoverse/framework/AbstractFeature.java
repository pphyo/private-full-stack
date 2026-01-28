package tech.codoverse.framework;

public abstract class AbstractFeature {

    private int id;
    private String title;
    protected DataContext context;

    public AbstractFeature(int id, String title, DataContext context) {
        this.id = id;
        this.title = title;
        this.context = context;
    }

    public void showMenu() {
        IO.println(String.format("%d. %s", id, title));
    }

    public String getTitle() {
        return title;
    }

    public abstract void doBusiness();

}
