public class Test{

	private String name;
	
	private int age;

	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}	

	public static void main(String[] args){
		Test test = new Test();
		test.setName("bollen");
		test.setAge(20);
		System.out.println(test.getName() + test.getAge());
	}
	
}
	
