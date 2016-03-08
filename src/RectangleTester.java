/*
 * [A]101
 * [TA's advise]
 * 1.Rectangle�����F(Recyangle), ���v�T�{���B��, �H��n�h�`�N��!
 * 2.�[�Jtry-catch���覡�D�`�n, �o���ӬO�ثe�ּƦ��ݨ쪺, extra bouns +1
 * 3.�[�Jif-else�����󦡤]�O�D�`�n, ���L�o����������T(�A�u���P�_�L�O�_��0, ���t�ȩO?), �t�~�p��ĳ�O�γ\�A�i�H�b��J�ᰨ�W�ˬd�O�_�����D, �Y�����D���ܪ�����X�ҥ~
 * ��X�ҥ~����kthrow(),�i�H��s�ݬݳ�!
 * 4.Good Job
 * */

import java.util.Scanner;

class Rectangle{
	int  x, y, height, width;	
	double area, perimeter;
	
	Rectangle(){
	}
	
	Rectangle(int height, int width, int x, int y){
		this.height = height;
		this.width = width;
		this.x = x;
		this.y = y;		
	}
	
	int getHeight(){
		return this.height;
	}
	
	int getWidth(){
		return this.width;
	}
	
	int getX(){
		return this.x;
	}
	
	int getY(){
		return this.y;
	} 
	
	public String toString(){
		return "java.Rectangle[x=" + this.x + ",y=" + this.y +",width=" + this.width + ",height=" + this.height +"]" +
		"\nArea = " +  ((double)this.width * (double)this.height) + 
		"\nPerimeter = " + (((double)this.width + (double)this.height)*2);
	}
}

public class RectangleTester {
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int  x1, y1, height1, width1;
		int  x2, y2, height2, width2;
		
		try{	
				System.out.println("Enter the Height of Recyangle 1");
				height1 = cin.nextInt();
				System.out.println("Enter the Width of Recyangle 1");
				width1 = cin.nextInt();
				System.out.println("Enter the y of Recyangle 1");
				y1 = cin.nextInt();
				System.out.println("Enter the x of Recyangle 1");
				x1 = cin.nextInt();
		
				System.out.println("Enter the Height of Recyangle 2");
				height2 = cin.nextInt();
				System.out.println("Enter the Width of Recyangle 2");
				width2 = cin.nextInt();
				System.out.println("Enter the y of Recyangle 2");
				y2 = cin.nextInt();
				System.out.println("Enter the x of Recyangle 2");
				x2 = cin.nextInt();
				
				if (height1 != 0 && height2 != 0)
					{
						if (width1 != 0 && width2 != 0 )
							{	
								Rectangle rect1 = new Rectangle(height1, width1, y1, x1);
								System.out.println(rect1);
								System.out.println();
								Rectangle rect2 = new Rectangle(height2, width2, y2, x2);
								System.out.println(rect2);
								System.out.println();
								System.out.println("End of Output");
							}
						else
							{
								System.out.println("Input wrong data , Please rerun");
								System.exit(0);
							}
					}
				else
					{
						System.out.println("Input wrong data , Please rerun");
						System.exit(0);
					}
			}
		catch (Exception e){
				System.out.println("Input wrong data , Please rerun");
				System.exit(0);
			}
		}		
	}
