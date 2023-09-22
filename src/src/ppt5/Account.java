package src.ppt5;

public class Account {
	
	// 은행에서 공통으로 관리하는 계좌번호
	private static int CNT;
	
	public synchronized static int createAccount() {
		return ++CNT;
	}
	
	// 계좌마다 가지고 있을 필드
	private int accountNo;
	private int balance;
	
	//Getter / Setter
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	// 생성자
	public Account() {
		setAccountNo(createAccount());
	}
	
	
	// 메서드
	// 입금
	public synchronized void deposit(int amount) {
		setBalance(getBalance() + amount);
	}
	// 출금
	public synchronized boolean withdraw(int amount) {
		if(getBalance() < amount) {
			return false;
		} else {
			setBalance(getBalance() - amount);
			return true;
		}
	}
	// 조회
	
	
}