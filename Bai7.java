package main;
import java.util.*;
import java.io.*;
public class Bai7 {
	public static void main(String[] args)throws IOException{
		Scanner sc=new Scanner(new File("DATA.in"));
		long sum=0;
		while(sc.hasNext()) {
			String s=sc.next();
			try {
				int n=Integer.valueOf(s);
			}catch(NumberFormatException ex) {
				try {
					long k=Long.valueOf(s);
					sum+=k;
				}catch(NumberFormatException ex2) {
					
				}
			}
		}
		System.out.println(sum);
	}
}
