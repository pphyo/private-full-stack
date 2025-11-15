package tech.codoverse;

public abstract class AbstractFeature {

    private int id;
    private String featureName;

    public AbstractFeature(int id, String featureName) {
        this.id = id;
        this.featureName = featureName;
    }

    public int getId() {
        return id;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void showMenu() {
        IO.println("%d. %s".formatted(id, featureName));
    }

    public abstract void doBusiness();

}
