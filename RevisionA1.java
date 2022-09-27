
public class RevisionA1 {

	public static void Calculator (int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}
	
	public static void CalculatorD() {
		System.out.println(5+5);
	}
	public static void CalculatorE(int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
	}
	public static int CalculatorF(int x, int y) {
		System.out.println(x+y);
		return x+y;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String
		String fullname = "Manjil";
		System.out.println(fullname);
		
		String c = fullname.toLowerCase();
		System.out.println(c);
		//method chaining
		int e = fullname.toLowerCase().toUpperCase().length();
		System.out.println(e);
		
		
		//comparison relational operator
		//entity<entity-----boolean
		
		System.out.println(12<5);
		System.out.println(12>5);
		System.out.println(12<=5);
		System.out.println(12>=5);
		System.out.println(12!=5);
		System.out.println(12==5);
		
		//Logical operator
		//AND,OR,NOT
		
		//And operation
		//True && True===>True
		//True && False===>False
		//False && True====>False
		//False && False====>False
		
		System.out.println(5!=8 && 9==9);
		
		//OR operation
		//True && True===>True
		//True && False===>True
		//False && True===>True
		//False && False ===>False
		
		System.out.println(7==9|| 8<7);
		
		//NOT
		//True==>False
		//False==>True
		System.out.println(!(10==10));
		
		//Conditional Statement
		//input--- multiple outcome-->
		//numner>0 && numner <=5----7% discount
		//number>7 && number <=17----13% discount
		//number >17------>25% discount
		
		int numberM = 9;
		if(numberM>0 && numberM <=7) {
			System.out.println("7% discount");
		}
		if(numberM>7 && numberM <17);{
		System.out.println("13% discount");
		}
		if(numberM>17) {
			System.out.println("25% discount");
		}
		
		if(numberM>0 && numberM <=7) {
			System.out.println("7% discount");
		}
		else if (numberM >7 && numberM<=17) {
			System.out.println("13% discount");
		}
		else if (numberM>17) {
			System.out.println("25% discount");
		}
		
		//switch case
		
		String country = "Nepal";
		switch (country) {
		case "India":
		case "Bhutan":
			System.out.println("Asian country");
			break;
		case "Nepal":
		case "Pakistan":
			System.out.println("South east asia");
			break;
		case "Japan":
		case "South Korea":
			System.out.println("East Asian");
			break;
			default:
			System.out.println("Please input correctly");
		}
		
		//Loop
		//for (initialization;conditioncheck;increment) {
			//statement
		//}
		
		for (int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3) {
				break;
			}
		}
		
		for (int i= 0;i<6;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		
		//while
		//initialization;
		//while(condition){
		//statement
		//increment/decrement
		//}
		int i3= 7;
		
		while(i3>=6) {
			System.out.println(i3);
			i3--;
		}
		
		while (i3>=1) {
			System.out.println(i3);
			if(i3==2) {
				break;
			}
			i3--;
		}
		
		while (i3>=3) {
			if(i3==2) {
				i3--;
				continue;
			}
			System.out.println(i3);i3--;
		}
		
		
		//functions
		
		int x1 = 15;
		int x2 = 7;
		System.out.println(x1+x2);
		System.out.println(x1-x2);
		System.out.println(x1*x2);
		System.out.println(x1/x2);
		System.out.println(x1%x2);
		
		int x3 = 16;
		int x4 = 9;
		System.out.println(x3+x4);
		System.out.println(x3-x4);
		System.out.println(x3*x4);
		System.out.println(x3/x4);
		System.out.println(x3%x4);
		
		
		
		CalculatorD();
		CalculatorD();
		
		CalculatorE(15,10);
		CalculatorE(100,25);
		
		int s = CalculatorF(8,4);
		System.out.println(s);
		System.out.println(s+3);
		
		
		
		
		
		
		
		
		
		
	}

}
