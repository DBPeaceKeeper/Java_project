package src.ppt5;

public class MainClass {

	public static void main(String[] args) {
		
	}
}


/*
 		ArrayList<String> list = new ArrayList<String>();
		String str;

		System.out.println("문자열을 입력해주세요. q를 누르면 종료됩니다.");

		Scanner sc = new Scanner(System.in);
		do {
			str = sc.nextLine();
			if(str.equals("q")) { break; }
			list.add(str);
		} while (true);

		sc.close();
		
		Comparator<String> big = ((String a, String b) -> {
			if(a.length() > b.length()) {
				return 1;            
			}
			else if(a.length() < b.length()) {
				return -1;
			}
			else {
				if(a.charAt(0) > b.charAt(0)) {
					return 1;
				}
				else if(a.charAt(0) < b.charAt(0)) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		Collections.sort(list,big);

		for(String elem : list) {
			System.out.println(elem);
		}
 */

/*		
public class MainClass {

	private static Vector<Account> accounts = new Vector<Account>();
	Random rand = new Random();
	public static void main(String[] args) {

		//객체를 만들어야 하는 경우
		// 스레드(계좌 10개 개설)
		Thread thread;
		for(int i = 0; i < 10; i++) {
			thread = new Thread(()->{
				accounts.add(new Account());
			});
			thread.start();
		}
		// 스레드(입금/출금)
		MainClass myBank = new MainClass();
		List<Thread> deposits = new ArrayList<>();
		List<Thread> withdraws = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			deposits.add(myBank.new Deposit());
			withdraws.add(myBank.new Withdraw());
		}

		for(var desposit:deposits) {
			desposit.start();
		}

		for(var withdraw:withdraws) {
			withdraw.start();
		}

	}

	class Deposit extends Thread {
		@Override
		public void run() {
			//입금
			int account;
			int amount;

			account = rand.nextInt(10);
			amount = rand.nextInt(10000) + 1;

			Account target = accounts.get(account);
			target.deposit(amount);
			System.out.println(target.getAccountNo() + "," + amount + "원 입금 완료 : 잔액(" + target.getBalance() + ")");
		}
	}

	class Withdraw extends Thread {
		@Override
		public void run() {
			//입금
			int account;
			int amount;

			account = rand.nextInt(10);
			amount = rand.nextInt(10000) + 1;

			Account target = accounts.get(account);
			if(target.withdraw(amount)) {
				System.out.println(target.getAccountNo() + "," + amount + "원 출금 완료 : 잔액(" + target.getBalance() + ")");
			}
			else {
				System.out.println(target.getAccountNo() + "," + amount + "원 출금 실패 : 잔액(" + target.getBalance() + ")");
			}
		}
	}

}
 */

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

/*
 ArrayList<String> list = new ArrayList<String>();
		String str;

		System.out.println("문자열을 입력해주세요. q를 누르면 종료됩니다.");

		Scanner sc = new Scanner(System.in);
		do {
			str = sc.nextLine();
			list.add(str);
		} while (!str.equals("q"));

		sc.close();

		Comparator<String> big = ((String a, String b) -> {
			if(a.length() > b.length()) {
				return 1;				
			}
			else if(a.length() < b.length()) {
				return -1;
			}
			else {
				if(a.charAt(0) > b.charAt(0)) {
					return 1;
				}
				else if(a.charAt(0) < b.charAt(0)) {
					return -1;
				}
				else {
					return 0;
				}
			}
		});

		Collections.sort(list,big);

		for(String elem : list) {
			System.out.println(elem);
		}
 */

