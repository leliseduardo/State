package State;

public class Packaging {
    private PackagingState state;

    public PackagingState getState() {
        return state;
    }

    public void setState(PackagingState state) {
        this.state = state;
    }

    public boolean manufacture() {
        return state.manufacture(this);
    }
    public boolean test() {
        return state.test(this);
    }
    public boolean store() {
        return state.store(this);
    }
    public boolean discard() {
        return state.discard(this);
    }
    public boolean recycle() {
        return state.recycle(this);
    }
}

