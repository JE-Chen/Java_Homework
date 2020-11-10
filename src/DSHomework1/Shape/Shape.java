package DSHomework1.Shape;

public abstract class Shape {

    protected String shapeName;

    abstract String getShapeName();
    abstract double computeArea();
    abstract double computePerimeter();
    abstract void readShapeData(double data1,double data2);
    @Override
    public String toString(){
        return this.shapeName;
    }
}
