package innerClasses;

public class TestService2 {
	public static void main(String[] args) {
		
	
    Service s=new Service() {

		@Override
		public void process() {
			System.out.println("Hello");
			
		}
    	
    };
//creating child class + overriding process() + creating object.
	s.process();
	
    Service s2=()->{System.out.println("bye");};
    s2.process();
	//creating child class + overriding process() + creating object.
  
}
}

