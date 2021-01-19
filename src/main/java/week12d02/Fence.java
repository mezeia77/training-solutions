package week12d02;

public enum Fence {
    PERFECT(2), NEED_UPGRADE(1), NO_FENCE(0);

    private int ID;

    Fence(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }
}
