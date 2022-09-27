

class PersonMan{
	//int age = 33;
	//String fullname = "Ananda Ghimire";
	
	
	int age;
	String fullname;
	static String country = "Nepal";
	
	public PersonMan(int age, String fl) {
		this.age = age;
		this.fullname = fl;
	}
	
	public void walk () {
		System.out.println("i can walk");
		System.out.println(this.fullname);
	}
	
	public static void Calling () {
		System.out.println("i can be called any object");
	}
	
}




public class RevisionA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PersonMan AnandaG = new PersonMan();
		//PersonMan AnandaK = new PersonMan();

		//with call constructor
		PersonMan AnandaG = new PersonMan (33,"Ananda G");
		PersonMan AnandaK = new PersonMan (33, "Ananda k");
		
		System.out.println(AnandaK.age);
		System.out.println(AnandaK.fullname);
		
		AnandaK.walk();
		PersonMan.Calling();
		System.out.println(PersonMan.country);
		
		
	}

}
