class Circle {
    
    double radius;
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public void calculateArea(){
        double area = 3.1416 * radius * radius;
        System.out.println("Radius is: " + radius);
        System.out.println("Area is: " + area);
    }
}

class Main {
    public static void main(String[] args) {
       
       Circle circleOne = new Circle(5.0);
       circleOne.calculateArea();
       
    }
}
