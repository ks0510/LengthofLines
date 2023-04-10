package linegeometry;

import java.util.Scanner;

/**
 * 
 * @author Kaif
 *
 */

public class CompareLength {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * 1)Get the first coordinates of line from  user input
		 * 2)Get the second coordinates of line from  user input
		 * 3)Calculate length of line by Mathematical functions
		 * 4)Get the length of another line from user input
		 * 5)Converting lengths of both lines L1 and L2 into objects for using equals(),compareTo() methods
		 * 6)To compare the  lengths of both  lines using compareTo method
		 */
		
                Scanner sc = new Scanner(System.in);
		
		/*
		 * 1) Get the first co-ordinate of line from  user input
		 */
		
		System.out.println("Enter the first co-ordinate of line");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		/*
		 * 2)Get the second co-ordinate of line from  user input
		 */
		
		System.out.println("Enter the Second co-ordinate of line");
		
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		/*
		 * 3)Calculate length of line by Mathematical functions
		 */
		
		double x = Math.pow((x2-x1), 2);
                double y = Math.pow((y2-y1), 2);
                int length1 = (int) Math.sqrt(x+y);
        
                System.out.println("Length of line is "+length1);
        
                 /*
                 * 4)Get the length of another line from user input
                 */
        
                System.out.println("Enter Length of Line 2");
        
                int length2=sc.nextInt();
        
                /*
                * 5) Converting lengths of both lines L1 and L2 into objects for using equals(),compareTo() methods
                */
        
               Integer obj1 = new Integer(length1);
               Integer obj2 = new Integer(length2);
        
               /*
               * 6)To compare the  lengths of both  lines using compareTo method
               */
        
              int result2=obj1.compareTo(obj2);
        
              if(result2 > 0) {
                    System.out.println("Length of line 1 is greater than length of Line 2");
             } else if(result2 < 0) {
                    System.out.println("Length of line 1  is less than length of Line 2");
             } else {
                   System.out.println("Length of line 1  is equal to length of Line 2");
             }
             sc.close();
    }
}
