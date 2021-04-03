package varArgs;

public class TestVarArgs {
	public static void main(String[] args) {
		System.out.println("------------display-----");
		display("hi");
		display("hi","how are You");
		display("java programming",".net","c++"); 
		display("welcome","to","java");
	}

	public static void display(String... data){
		System.out.println("*******************************");
		for(String v: data){
			System.out.println(v);
		}
	}
}
