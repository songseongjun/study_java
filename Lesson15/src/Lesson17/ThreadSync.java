package Lesson17;

public class ThreadSync {
public static void main(String[] args)throws Exception {
	
	Counter counter =new Counter();
	MySyn mySync1=new MySyn(counter);
	MySyn mySync2=new MySyn(counter);
	
	mySync1.start();
	mySync2.start();
	
	
	mySync1.join();
	mySync2.join();
	
	System.out.println(counter.i);
}
}
class Counter{
	int i;  

	void increase() {

		synchronized (this) {
			i++;
		}
	}

}


class MySyn extends Thread{		
		Counter counter;						
     	
     	public MySyn(Counter counter) {
     		this.counter =counter;
     	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100_000; i++) {
			counter.increase();
			
		}
		
	}
	
}