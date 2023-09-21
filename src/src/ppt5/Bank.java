package src.ppt5;


public class Bank {
	
	private int money;
	
	public Bank(){
		Thread input = new Thread(new InputMoney());
		Thread output = new Thread();
	}
	
	class tongJang {
		
	
	}
	
	static class InputMoney implements Runnable {

		public void run() {
			
		}
		
	}
	
	
}

/*
static class IncrementThread implements Runnable{
@Override
public void run() {
	synchronized(obj) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				try {
					obj.notify();
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			icrCnt++;
			System.out.println("(+)" + ++counter + " ");
		}
		obj.notify();
	}
}
}
*/