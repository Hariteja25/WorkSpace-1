package javahdfc;

public class Launch {

	public static void main(String[] args) {
		
		
	
		//up casting
		
	Parent p=new Child();
	
		p.read();
		
		
		//downcasting
		
		((Child)(p)).write();
		
		
		
		Child c= (Child)p;
		c.write();
		c.read();
		

	}

}
