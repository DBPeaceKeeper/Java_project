package src.ppt4;

public class upAndDown {
	
	private int num;
	private int randomNum;
	
	public void getRandomNum() {
		randomNum = (int)(Math.random()* 100 + 1);
	}
	
	public void setNum(int num) {
		this.num = num;		
	}
	
	public String isUp() {
		if(num > randomNum) {
			return "down";
		}
		else if(num < randomNum) {
			return "up";
		}
		else {
			return "good";
		}
	}
	
	public boolean end(String isSame) {
		System.out.println(isSame);
		if (isSame.equals("good")) {
			return true;
		}
		else {
			return false;
		}
	}

}
