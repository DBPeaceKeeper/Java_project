package src.ppt5;

import java.util.HashMap;

public class Bank {
	private HashMap<Integer, Integer> accountNum = new HashMap<>();	

	public Bank() {
		Integer userAccount;
		// 계좌번호 1~100 랜덤 생성
		do {
			userAccount = (int) (Math.random() * 100 + 1);
		} while(accountNum.containsKey(userAccount));

		accountNum.put(userAccount, 0);
		System.out.println("계좌번호가 생성됐습니다: " + userAccount);
	}

	public synchronized void deposit(int Num, int money) {
		if(!accountNum.containsKey(Num)) {
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
		else {
			money += accountNum.get(Num);
			accountNum.put(Num, money);
		}
	}

	public synchronized void withDrawal(int Num, int money) {
		if(!accountNum.containsKey(Num)) {
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
		else if (accountNum.get(Num) > money){
			System.out.println("계좌에 잔액이 부족합니다.");
		}
		else {
			money -= accountNum.get(Num);
			accountNum.put(Num, money);	
		}
	}

	public void pirntBalance(int Num) {
		if(!accountNum.containsKey(Num)) {
			System.out.println("존재하지 않는 계좌번호입니다.");
		}
		else {
			System.out.println("계좌의 잔액은 " + accountNum.get(Num) + "원 입니다.");
		}
	}
}