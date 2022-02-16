//package singleton;

public class Singleton{
	private static Singleton uniqueInstance;
	
	private Singleton() {
        
		System.out.println("Instance has been Created");
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance== null) {
			synchronized (Singleton.class) {
				
				if(uniqueInstance == null) {
					uniqueInstance=new Singleton();
				}
			}
			
		}
		return uniqueInstance;
	}
	
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			public void run() {
				Singleton obj=Singleton.getInstance();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				Singleton obj=Singleton.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}
}