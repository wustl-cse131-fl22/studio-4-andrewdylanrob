package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(123,12,45);
		StdDraw.filledRectangle(0.5, 0.5, 0.35, 0.2);
		StdDraw.setPenColor(0,12,45);
		double[] xPoints= new double[6];
		xPoints[0]= 0.5;
		xPoints[1]= 0.7;
		xPoints[2]= 0.7;
		xPoints[3]= 0.5;
		xPoints[4]= 0.3;
		xPoints[5]= 0.3;
		double[] yPoints= new double[6];
		yPoints[0]= 0.7;
		yPoints[1]= 0.6;
		yPoints[2]= 0.4;
		yPoints[3]= 0.3;
		yPoints[4]= 0.4;
		yPoints[5]= 0.6;
		
		StdDraw.filledPolygon(xPoints, yPoints);
		StdDraw.setPenColor(230,215,0);
		StdDraw.filledCircle(0.5, 0.6, 0.05);
		StdDraw.setPenRadius(0.02);
		StdDraw.line(0.5, 0.6, 0.5, 0.4);
		StdDraw.line(0.5, 0.4, 0.45, 0.35);
		StdDraw.line(0.5, 0.4, 0.55, 0.35);
		StdDraw.line(0.5, 0.5, 0.55, 0.55);
	}
}