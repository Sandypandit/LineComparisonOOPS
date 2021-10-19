package com.bridgelabz;
import java.util.Scanner;
import java.text.DecimalFormat;

public class LineComparison {
	int x1=0, x2=0, y1=0, y2=0;
	
	public double Length() {
	        //used decimal format to limit numbers after decimal
		DecimalFormat df = new DecimalFormat("#.00");
		
		double length = Math.sqrt(Math.pow((this.x2-this.x1),2)+Math.pow((this.y2-this.y1),2));
		System.out.println("Length of the Line is "+df.format(length)+"\n");
		
		//converting to object so that equals method can use it
		Double linelength = Double.valueOf(length); 
		return linelength;
	}

	static void Equal(Double lineOne, Double lineTwo) {
		//creating method to check equality of any two lines
		if(lineOne.equals(lineTwo)){ 
			System.out.println("\ngiven two lines are equal");
			}
		else{ 
			System.out.println("\nGiven two lines are not equal"); 
			}
		
	}
	
	public LineComparison() {
		int lineNo = 1;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter points of line %d in Following Sequence"
				+ "\nX1\nX2\nY1\nY2\n",lineNo++);
		int x1=sc.nextInt(); 
		int x2=sc.nextInt(); //getting end points of lines
		int y1=sc.nextInt(); 
		int y2=sc.nextInt();
		
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public static void main(String[] args) {
				
		LineComparison line1 = new LineComparison();
		line1.Length();
		
		LineComparison line2 = new LineComparison();
		line2.Length();
		
		//passing line 1 and line 2 lengths in Equals method
		Equal(line1.Length(),line2.Length());

		
	}

}
