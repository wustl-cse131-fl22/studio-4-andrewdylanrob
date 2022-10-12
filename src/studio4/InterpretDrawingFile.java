package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int redComponent= in.nextInt();
		int greenComponent= in.nextInt();
		int blueComponent= in.nextInt();
		boolean isfilled= in.nextBoolean();
		double x1= in.nextDouble();
		double y1= in.nextDouble();
		double x2= in.nextDouble();
		double y2= in.nextDouble();
		double x3= in.nextDouble();
		double y3= in.nextDouble();
		
		double[] xPoints= new double[3];
		xPoints[0]= x1;
		xPoints[1]= x2;
		xPoints[2]= x3;
		
		double[] yPoints= new double[3];
		yPoints[0]= y1;
		yPoints[1]= y2;
		yPoints[2]= y3;
		
		if (isfilled== true && shapeType.equals("rectangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledRectangle(x1,y1,x2,y2);
		}else if (isfilled== false && shapeType.equals("rectangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.rectangle(x1,y1,x2,y2);
		}else if (isfilled==true && shapeType.equals("ellipse")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledEllipse(x1,y1,x2,y2);
		}else if (isfilled==false && shapeType.equals("ellipse")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.ellipse(x1,y1,x2,y2);
		}else if (isfilled==true && shapeType.equals("triangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.filledPolygon(xPoints, yPoints);
			
		}else if (isfilled==false && shapeType.equals("triangle")) {
			StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
			StdDraw.polygon(xPoints, yPoints);
		}
	
	}
}
