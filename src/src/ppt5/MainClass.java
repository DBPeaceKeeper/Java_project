package src.ppt5;

// import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		
	}
}

/* 1번
}
Driver Cho = new Driver();

int num = 0;
Scanner sc = new Scanner(System.in);

System.out.println("정보처리 기사에 응시한 학생 번호를 입력하세요. 입력을 종료하려면 0번을 입력하세요.");

while(true) {
	num = sc.nextInt();
	if(num == 0) {
		break;
	}
	Cho.setInforProcess(num);
}

System.out.println("보안 기사에 응시한 학생 번호를 입력하세요. 입력을 종료하려면 0번을 입력하세요.");

while(true) {
	num = sc.nextInt();
	if(num == 0) {
		break;
	}
	Cho.setsecurity(num);
}

sc.close();

Cho.allTestStudent();
 */

/* 2번
Object a = new Object();

a.addObject();
a.printObject();
 */

/* 3번
CountChar exam = new CountChar();
exam.inputString();
exam.countChar();
exam.inputCountStr();
 */

/*
public static int counter = 0;
public static int icrCnt = 0;
public static int dcrCnt = 0;
private static final Object obj = new Object();


public static void main(String[] args) {

	Thread incrementT = new Thread(new IncrementThread());
	Thread decrementT = new Thread(new DecrementThread());

	incrementT.start();
	decrementT.start();

	try {
		incrementT.join();
		decrementT.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	System.out.println("Counter: " + counter + " icrCnt: " + icrCnt + " dcrCnt: " + dcrCnt);	
}

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

static class DecrementThread implements Runnable{
	@Override
	public void run() {
		synchronized(obj) {
			for(int i =0; i < 10; i++) {
				if(i == 7) {
					obj.notify();
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("(-)" + --counter + " ");
				dcrCnt++;
			}
			obj.notify();
		}
	}
}
 */