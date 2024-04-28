package hw4;

import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayOfRectangles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("rectangles.txt"));
        
        int numRectangles = sc.nextInt(); 
        Rectangle[] rectangles = new Rectangle[numRectangles];
        
        for (int i = 0; i < rectangles.length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int width = sc.nextInt();
            int height = sc.nextInt();
            rectangles[i] = new Rectangle(x, y, width, height);
        }
        
        sc.close();
         
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
        
        System.out.println("contains consecutive intersecting rectangles: " + 
                containsConsecutiveIntersectingRectangles(rectangles));
        
        System.out.println("contains intersecting rectangles: " + 
                containsIntersectingRectangles(rectangles));
    }
	
    public static boolean containsConsecutiveIntersectingRectangles(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length - 1; i++) {
            if (rectangles[i].intersects(rectangles[i + 1])) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean containsIntersectingRectangles(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = i + 1; j < rectangles.length; j++) {
                if (rectangles[i].intersects(rectangles[j])) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
