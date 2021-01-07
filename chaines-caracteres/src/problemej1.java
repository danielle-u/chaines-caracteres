import java.util.Scanner;

/*
* Author : dani
*Date: Jan. 7, 2021
*/
public class problemej1
	{

		public static void main(String[] args)
			{
				int threepointa=0; int twopointa=0; int onepointa=0; int threepointb=0; int twopointb=0; int onepointb=0;
				Scanner sc=new Scanner(System.in);
				
				threepointa=sc.nextInt();
				twopointa=sc.nextInt();
				onepointa=sc.nextInt();
				threepointb=sc.nextInt();
				twopointb=sc.nextInt();
				onepointb=sc.nextInt();
				 
				int somme1 = (threepointa * 3) + (twopointa * 2) + (onepointa);
				int somme2 = (threepointb * 3) + (twopointb * 2) + (onepointb);
				
				
				
				if (somme1>somme2)
					System.out.println("a");
				if (somme2>somme1)
					System.out.println("b");
				else
					System.out.println("t");
					

			}

	}
