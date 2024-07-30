package State;

public class ManufacturedPackagingState extends PackagingState {
    private static ManufacturedPackagingState instance = new ManufacturedPackagingState();

    public static ManufacturedPackagingState getInstance() {
        return instance;
    }

    public String getState() {
        return "Manufactured";
    }

    public boolean test(Packaging packaging) {
        packaging.setState(TestedPackagingState.getInstance());
        return true;
    }
}

