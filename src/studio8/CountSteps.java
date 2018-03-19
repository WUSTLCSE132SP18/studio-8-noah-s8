package studio8;

import java.io.File;
import java.util.Scanner;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.
public class CountSteps{
	
	
	public static void main(String[] args)
	{
   
		String value[] = new String[3];
		double x[] = new double[10000];
		double y[] = new double[10000];
		double z[] = new double[10000];
		int a= 0;
		
		Scanner in = new Scanner(new File("data/accelerdatastufffinal.csv"));
		while (in.hasNext()==true)
		{
			String stuff = in.nextLine();
			 value =stuff.split(",");
			 a++;
			
				x[a]=value[0];
				y[a]=value[1];
				z[a]=value[2]
			 
		}
		
		 
		}
		if (x[0]>0&&x[1]>0&&x[2]>0)
		{
			if(x[0]<x[1]&&x[1]>x[2])
			{
				System.out.println("peak at " + x[1]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}