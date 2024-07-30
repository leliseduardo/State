package State;

public class RecycledPackagingState extends PackagingState {
    private static RecycledPackagingState instance = new RecycledPackagingState();

    public static RecycledPackagingState getInstance() {
        return instance;
    }

    public String getState() {
        return "Recycled";
    }

    public boolean manufacture(Packaging packaging) {
        packaging.setState(ManufacturedPackagingState.getInstance());
        return true;
    }
}

