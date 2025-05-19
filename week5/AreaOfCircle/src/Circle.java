package AreaOfCircle.src;

//defineing a class name Circle
class Circle {
    //String name;
    double radius;
    //int salary;

    //making constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double AreaofCircle() {

        return 3.14 * radius * radius;
    }

    // method to display detils
    public void displaydetail() {
        System.out.println("the arean of circle : " + AreaofCircle());
    }

}
