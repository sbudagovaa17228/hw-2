public class TestPointSegment {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        p1.toString();
        p2.toString();
        System.out.println("distance p1-p2 = " + p1.distance(p2));
 
        Segment s = new Segment(p1, p2);
        System.out.println("length = " + s.length());
        System.out.println("slope = " + s.getSlope());
        System.out.println("intercept = " + s.getIntercept());
 
        Point onLine = new Point(2, 2);
        Point offLine = new Point(2, 3);
        Point beyond = new Point(6, 6);
 
        System.out.println("(2,2) on line?    " + s.isOnLine(onLine));
        System.out.println("(2,3) on line?    " + s.isOnLine(offLine));
        System.out.println("(2,2) on segment? " + s.isOnSegment(onLine));
        System.out.println("(6,6) on line?    " + s.isOnLine(beyond));
        System.out.println("(6,6) on segment? " + s.isOnSegment(beyond));

        System.out.println("before translate: " + s);
        s.translate(3, 4);
        System.out.println("after translate(1,1): " + s);
    }
}
