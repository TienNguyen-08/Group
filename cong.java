package CONG;

import java.util.Scanner;

public class cong {
	int a,b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a=b;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b=b;
	}
	public void input()	{
		Scanner kb=new Scanner(System.in);
			System.out.println("Nhap a: ");
			this.setA(kb.nextInt());
			
			System.out.println("Nhap b: ");
			this.setB(kb.nextInt());
	}
	public void Cong() {
		System.out.println("Cong: ");
		System.out.printf("%d + %d = %d %n",this.a,this.b,this.a+this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			cong m=new cong();
			m.input();
			m.Cong();
	}
}