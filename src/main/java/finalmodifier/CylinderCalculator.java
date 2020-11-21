package finalmodifier;

public class CylinderCalculator {

    public double calculateVolume (int r, int h){
        return r*r*CircleCalculator.pi*h;

    }

    public double calculateSurfaceArea (int r, int h){
        return 2*r*r*CircleCalculator.pi+2*r*h*CircleCalculator.pi;

    }
}
