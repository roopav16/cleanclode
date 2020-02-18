package task4.cleancode;
import java.util.*;
public class Simple 
{
	public static float calculateSI()
	{
		float p,t,r;
		Scanner sc=new Scanner(System.in);
		p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		return p*t*r/100;
	}
}