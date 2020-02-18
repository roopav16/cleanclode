package task4.cleancode;
import java.util.*;
public class HouseConstruction 
{
	public static double construct()
	{
		Scanner sc=new Scanner(System.in);
		double area;
		int ch;
		ch=sc.nextInt();
		int a[]= {1200,1500,1800,2500};
		area=sc.nextDouble();
		return area*a[ch-1];
	}
}