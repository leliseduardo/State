package State;

public class StoredPackagingState extends PackagingState {
    private static StoredPackagingState instance = new StoredPackagingState();

    public static StoredPackagingState getInstance() {
        return instance;
    }

    public String getState() {
        return "Stored";
    }
}

