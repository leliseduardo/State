package State;

public abstract class PackagingState {
    public abstract String getState();

    public boolean manufacture(Packaging packaging) {
        return false;
    }

    public boolean test(Packaging packaging) {
        return false;
    }

    public boolean store(Packaging packaging) {
        return false;
    }

    public boolean discard(Packaging packaging) {
        return false;
    }

    public boolean recycle(Packaging packaging) {
        return false;
    }
}

