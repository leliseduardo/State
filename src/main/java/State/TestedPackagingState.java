package State;

public class TestedPackagingState extends PackagingState {
    private static TestedPackagingState instance = new TestedPackagingState();

    public static TestedPackagingState getInstance() {
        return instance;
    }

    public String getState() {
        return "Tested";
    }

    public boolean store(Packaging packaging) {
        packaging.setState(StoredPackagingState.getInstance());
        return true;
    }

    public boolean discard(Packaging packaging) {
        packaging.setState(DiscardedPackagingState.getInstance());
        return true;
    }

    public boolean recycle(Packaging packaging) {
        packaging.setState(RecycledPackagingState.getInstance());
        return true;
    }
}

