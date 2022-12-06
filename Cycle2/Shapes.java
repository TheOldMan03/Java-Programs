import java.util.Scanner;

abstract class Shapes{

    abstract void numberofSides();
    
}

class Triangle extends Shapes{

    void numberofSides(){
        System.out.println("The Number of Sides in a Triangle is 3");
    }
}

class Rectangle extends Shapes{

    void numberofSides(){
        System.out.println("The Number of Sides in a Rectangle is 4");
    }
}

class Hexagon extends Shapes{

    void numberofSides(){
        System.out.println("The Number of Sides in a Hexagon is 6");
    }
}

class Shape{
    public static void main(String args[]){

        Triangle a=new Triangle();
        Rectangle b=new Rectangle();
        Hexagon c=new Hexagon();

        a.numberofSides();
        b.numberofSides();
        c.numberofSides();
    }
}


