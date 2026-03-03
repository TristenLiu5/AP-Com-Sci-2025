package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {



    }

    // public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
    }

    public double perimeter() {
        double perimeter = 0.0;
        int size = myPolygon.size();

        if(size > 1) {
            for(int i = 0; i < size; i++) {
                Point2D.Double p1 = myPolygon.get(i);
                Point2D.Double p2 = myPolygon.get((i + 1) % size);

                perimeter += (Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2)));

            }
        }


         return perimeter;
    }

    public double area() {
        int size = myPolygon.size();
        Double area = 0.0;

        for(int i = 0; i < size; i++) {
            Point2D.Double p1 = myPolygon.get(i);
            Point2D.Double p2 = myPolygon.get((i + 1) % size);

            area += (p2.getX() * p1.getY());


        }
        for(int j = 0; j < size; j++) {
            Point2D.Double p1 = myPolygon.get(j);
            Point2D.Double p2 = myPolygon.get((j + 1) % size);

            area -= (p2.getY() * p1.getX());


        }

        area /= 2;

        return Math.abs(area);
    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try {
            // TODO: Draw the polygon.
            // Documents: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html\
            int size = myPolygon.size();
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));
            for(int i = 0; i < size; i++) {
            Point2D.Double p1 = myPolygon.get(i);
            Point2D.Double p2 = myPolygon.get((i + 1) % size);

            myDrawingTool.move(p1.getX(), p1.getY());
            myDrawingTool.move(p2.getX(),p2.getY());


            }




        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
