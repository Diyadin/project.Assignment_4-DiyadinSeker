
public class Main {
public static void main(String[]args){
	MyThreadClass firstThread = new MyThreadClass();
	firstThread.setId(1);
	Thread thread1 = new Thread(firstThread);
	
	
	
	MyThreadClass secondThread = new MyThreadClass();
	Thread thread2 = new Thread(secondThread);
	secondThread.setId(2);
	
	
	thread1.start();
	thread2.start();
	
	
	
}
}
