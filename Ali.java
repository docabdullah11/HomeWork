package testFeb;

public class Ali {

	public static void main(String[] args) {
		
		//-------Arithmatic Operators-------
		
		int a=50;
		int b=60;
		int c=70;
		int d=80;
		
		int postIncrementResults = ++a;
		int postDecrementResults = --d;
		
		
				
		
		System.out.println("The addition of a and b is = " + (a+b));
		System.out.println("The difference of a and b is = " + (a-b));
		System.out.println("The multiplication of a and b is = " + (a*b));
		System.out.println("The division of b and a is = " + (b/a));
		System.out.println("The modula of b and a is = " + (b%a));
		System.out.println(postIncrementResults);
		System.out.println(postDecrementResults);
		
		//-------------Relational Operators----------
		
		System.out.println("The result is " +(a>=b));  //False
		System.out.println("The result is " +(a<=b));   //True
		System.out.println("The result is " +(b>a));    //True
		System.out.println("The result is " +(b<a));    //False
		System.out.println("The reault is " +(b==c));   //False
		System.out.println("The result is " +(c==c));   //True
		System.out.println("The result is " +(b!=c));   //True
		
		
		
		//------------------Logical Operators--------
		
		
		int numberOne=5;
		int numberTwo=6;
		int numberThree=7;
		int numberFour= 8;
		
		
		
		System.out.println((numberOne == numberTwo)&&(numberThree==numberFour));	
		System.out.println((numberThree==numberFour)||(numberOne==numberTwo));
	
		
		
		boolean booleanResults = !((numberFour==numberThree) && (numberOne==numberTwo));
		
		
		System.out.println(booleanResults);
		
		
		//------------Assignment Operators------
		
		int m=1;
		int n=2;
		int o=3;
		int p=4;
		
		System.out.println(m+=n);
		System.out.println(p-=o);
		System.out.println(m*=n);
		System.out.println(m/=n);
		System.out.println(m%=n);
		
		//-----------Ternary Operators----------
	
         
		int y, z;
		y = 5;
		z = (y==5)? 10: 20;
		
		System.out.println("Value of z is : " + z);
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	
		
		
		

	


