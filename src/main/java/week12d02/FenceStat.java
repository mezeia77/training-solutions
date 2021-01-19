package week12d02;

public class FenceStat {

    private int qty;
    private Fence fence;

    public FenceStat(int qty, Fence fence) {
        this.qty = qty;
        this.fence = fence;
    }

    public int getQty() {
        return qty;
    }

    public Fence getFence() {
        return fence;
    }
}
