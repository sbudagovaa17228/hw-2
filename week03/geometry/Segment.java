public class Segment {
    private Point p1;
    private Point p2;

    //constructors

    public Segment(Point p1, Point p2){
        setP1(p1);
        setP2(p2);
    }

    public Segment(float x1, float y1, float x2, float y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    //setters getters


    void setP1(Point p1){
        this.p1 = p1;
    }
    Point getP1(){
        return p1;
    }
    void setP2(Point p2){
        this.p2 = p2;
    }
    Point getP2(){
        return p2;
    }

    public void translate(float dX, float dY){
        p1.translate(dX, dY);
        p2.translate(dX, dY);
    }

    //lenght()
    public float length(){
        return p1.distance(p2);
    }

    public float getSlope(){
        if(p1.getX()== p2.getX()){
            return 0;
        }
        return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
    }

    public float getIntercept(){
        return p1.getY()-getSlope()*p1.getX();
    }

    public boolean isOnLine(Point p){
        float expectedY = getSlope()*p.getX() + getIntercept();
        return expectedY == p.getY();
    }

    public boolean isOnSegment(Point p){
        if(!isOnLine(p)){ //if it is false - it will become true and return false
            return false;
        }
        boolean withinX= p.getX()>=Math.min(p1.getX(), p2.getX()) && p.getX()<= Math.max(p1.getX(), p2.getX());
        boolean withinY= p.getY()>=Math.min(p1.getY(), p2.getY()) && p.getY()<= Math.max(p1.getY(), p2.getY()); 
        return withinX && withinY;
    }
    @Override
    public String toString() {
    return "Segment[" + p1 + " -> " + p2 + "]";
}


}
