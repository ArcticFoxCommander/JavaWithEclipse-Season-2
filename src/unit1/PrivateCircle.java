package unit1;

public class PrivateCircle { 
public double radius = 1; 
     /** Find the area of this circle */
public double getArea() {
  return radius * radius * Math.PI; 
} 
public static void main(String[] args) {
    SimpleCircle myCircle = new SimpleCircle(); 
    System.out.println("Radius is "+ myCircle.radius); 
} 
} 
