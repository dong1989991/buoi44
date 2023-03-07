package Circle;

public class class_hinhTru extends class_hinhTron{
    private double height;  // private variable

    // Constructor with default color, radius and height
    public class_hinhTru() {
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public class_hinhTru(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public class_hinhTru(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }
}
