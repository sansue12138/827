package homework;

/**
 * @author liuchang
 * @Create 2022-08-20-16:18
 */
public class TriAngle {
    private double base;
    private double height;
    private double area;

    public TriAngle(double base,double height){
        setBase(base);
        setHeight(height);
        setArea();
    }
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    public void setArea(){
        this.area=(getBase()*getHeight())/2;
    }

    public double getArea() {
        return area;
    }
}
