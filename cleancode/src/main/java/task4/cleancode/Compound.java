package task4.cleancode;
import java.util.*;
public class Compound 
{
	public static double calculateCI()
	{
		int p,t,n;
		double r;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		t=sc.nextInt();
		n=sc.nextInt();
		r=sc.nextDouble();
		return (p*Math.pow(1+(r/n), n*t))-p;
	}
}