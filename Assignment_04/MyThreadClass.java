
public class MyThreadClass implements Runnable {
private int id= 0;

public int getId(){
	return id;
}
	
public void setId(int id){
	this.id = id;
	
}

public void run(){

	
	for (int i = 0; i<50;i++){
		if (id % 2 == 0) {
			System.out.println("MyThreadClass: " +"ID :" + this.getId() + " value = "  );

			} else {
				System.out.println("MyThreadClass: " +"ID :" + this.getId() + " value = " );
			}
		
		
	//	System.out.println("MyThreadClass: " +"ID :" + this.getId() + " value = " + i);
		
	}
	
	
}
}
