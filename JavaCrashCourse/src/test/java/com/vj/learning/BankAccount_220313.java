package com.vj.learning;

import java.text.NumberFormat;

public class BankAccount_220313 {

	// Account numbers are lengthy, so use long instead of int
	// We can use Wrapper class here for learning (Long instead of long)
	Long accountNumber = 416728551703l;
	String accountHolderName = "Vijay Roshan";
	Integer accountBalance = 3000000;
	String bowBow;

	public void getBalance() {
		// To format the number to Currency using Number Format
		System.out.println(
				"The balance for the account is: " + NumberFormat.getCurrencyInstance().format(accountBalance));
	}

	public static void main(String[] args) {

		BankAccount_220313 access = new BankAccount_220313();
		access.getBalance();
		System.out.println(access);
		System.out.println(access.bowBow);
	}

}
