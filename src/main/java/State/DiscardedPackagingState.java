package State;

public class DiscardedPackagingState extends PackagingState {

    private DiscardedPackagingState() {}

    private static DiscardedPackagingState instance = new DiscardedPackagingState();

    public static DiscardedPackagingState getInstance() {
        return instance;
    }

    public String getState() {
        return "Discarded";
    }

}

