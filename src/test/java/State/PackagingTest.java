package State;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PackagingTest {

    Packaging packaging;

    @BeforeEach
    public void setUp() {
        packaging = new Packaging();
    }

    // Manufacturing
    @Test
    public void manufacturedPackagingCannotBeManufacturedAgain() {
        packaging.setState(ManufacturedPackagingState.getInstance());
        assertFalse(packaging.manufacture());
    }

    @Test
    public void manufacturedPackagingCannotBeStored() {
        packaging.setState(ManufacturedPackagingState.getInstance());
        assertFalse(packaging.store());
    }

    @Test
    public void manufacturedPackagingCannotBeDiscarded() {
        packaging.setState(ManufacturedPackagingState.getInstance());
        assertFalse(packaging.discard());
    }

    @Test
    public void manufacturedPackagingCannotBeRecycled() {
        packaging.setState(ManufacturedPackagingState.getInstance());
        assertFalse(packaging.recycle());
    }

    @Test
    public void manufacturedPackagingCanBeTested() {
        packaging.setState(ManufacturedPackagingState.getInstance());
        assertTrue(packaging.test());
        assertEquals(TestedPackagingState.getInstance(), packaging.getState());
    }

    // Testing
    @Test
    public void testedPackagingCannotBeManufactured() {
        packaging.setState(TestedPackagingState.getInstance());
        assertFalse(packaging.manufacture());
    }

    @Test
    public void testedPackagingCanBeStored() {
        packaging.setState(TestedPackagingState.getInstance());
        assertTrue(packaging.store());
        assertEquals(StoredPackagingState.getInstance(), packaging.getState());
    }

    @Test
    public void testedPackagingCanBeDiscarded() {
        packaging.setState(TestedPackagingState.getInstance());
        assertTrue(packaging.discard());
        assertEquals(DiscardedPackagingState.getInstance(), packaging.getState());
    }

    @Test
    public void testedPackagingCanBeRecycled() {
        packaging.setState(TestedPackagingState.getInstance());
        assertTrue(packaging.recycle());
        assertEquals(RecycledPackagingState.getInstance(), packaging.getState());
    }

    @Test
    public void testedPackagingCannotBeTestedAgain() {
        packaging.setState(TestedPackagingState.getInstance());
        assertFalse(packaging.test());
    }

    // Storage
    @Test
    public void storedPackagingCannotBeManufactured() {
        packaging.setState(StoredPackagingState.getInstance());
        assertFalse(packaging.manufacture());
    }

    @Test
    public void storedPackagingCannotBeStoredAgain() {
        packaging.setState(StoredPackagingState.getInstance());
        assertFalse(packaging.store());
    }

    @Test
    public void storedPackagingCannotBeDiscarded() {
        packaging.setState(StoredPackagingState.getInstance());
        assertFalse(packaging.discard());
    }

    @Test
    public void storedPackagingCannotBeRecycled() {
        packaging.setState(StoredPackagingState.getInstance());
        assertFalse(packaging.recycle());
    }

    @Test
    public void storedPackagingCannotBeTested() {
        packaging.setState(StoredPackagingState.getInstance());
        assertFalse(packaging.test());
    }

    // Discard
    @Test
    public void discardedPackagingCannotBeManufactured() {
        packaging.setState(DiscardedPackagingState.getInstance());
        assertFalse(packaging.manufacture());
    }

    @Test
    public void discardedPackagingCannotBeStored() {
        packaging.setState(DiscardedPackagingState.getInstance());
        assertFalse(packaging.store());
    }

    @Test
    public void discardedPackagingCannotBeDiscardedAgain() {
        packaging.setState(DiscardedPackagingState.getInstance());
        assertFalse(packaging.discard());
    }

    @Test
    public void discardedPackagingCannotBeRecycled() {
        packaging.setState(DiscardedPackagingState.getInstance());
        assertFalse(packaging.recycle());
    }

    @Test
    public void discardedPackagingCannotBeTested() {
        packaging.setState(DiscardedPackagingState.getInstance());
        assertFalse(packaging.test());
    }

    // Recycling
    @Test
    public void recycledPackagingCanBeManufactured() {
        packaging.setState(RecycledPackagingState.getInstance());
        assertTrue(packaging.manufacture());
        assertEquals(ManufacturedPackagingState.getInstance(), packaging.getState());
    }

    @Test
    public void recycledPackagingCannotBeStored() {
        packaging.setState(RecycledPackagingState.getInstance());
        assertFalse(packaging.store());
    }

    @Test
    public void recycledPackagingCannotBeDiscarded() {
        packaging.setState(RecycledPackagingState.getInstance());
        assertFalse(packaging.discard());
    }

    @Test
    public void recycledPackagingCannotBeRecycledAgain() {
        packaging.setState(RecycledPackagingState.getInstance());
        assertFalse(packaging.recycle());
    }

    @Test
    public void recycledPackagingCannotBeTested() {
        packaging.setState(RecycledPackagingState.getInstance());
        assertFalse(packaging.test());
    }
}
