package com.bridgelabz;
import java.util.Random;
import java.text.DecimalFormat;

public class LineComparison {
	int x1, x2, y1, y2;
	
	public void Length() {
	  //used decimal format to limit numbers after decimal
	  DecimalFormat df = new DecimalFormat("#.00");	  
	  double length = Math.sqrt(Math.pow((this.x2-this.x1),2)+Math.pow((this.y2-this.y1),2));
	  System.out.println("Length of the Line is "+df.format(length));
	}
	
	public LineComparison(int x1,int x2,int y1,int y2) {
		this.x1=x1; //generating constructor
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	public static void main(String[] args) {
		Random rd = new Random();
		int x1=rd.nextInt(10); int x2=rd.nextInt(10); //getting end points of lines
		int y1=rd.nextInt(10); int y2=rd.nextInt(10);
		LineComparison line = new LineComparison(x1,x2,y1,y2);
		
		line.Length();
		
	}

}

