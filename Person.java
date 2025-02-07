package task6;

public class Person {

			private String name;
		private int age;
		//constructor to initialize name and age
		public Person(String name, int age) {
			this.name=name;
			this.age=age;
		}
		//getter method for name
		public String getName() {
			return name;
		}
		//getter method for age
		public int getAge() {
			return age;
			
    }
		public static void main (String[] args ) {
			Person person1= new Person ("Aparna",30);
			System.out.println("Name:" + person1.getName());
			System.out.println("Age:" + person1.getAge());
		}
}

	
	
