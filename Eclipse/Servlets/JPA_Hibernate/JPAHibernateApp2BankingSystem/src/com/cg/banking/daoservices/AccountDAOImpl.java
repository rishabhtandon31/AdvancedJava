package com.cg.banking.daoservices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.util.ConnectionProvider;

public class AccountDAOImpl implements AccountDAO{

	@Override
	public  Account saveAccountDetails(Account account) {
		EntityManager entityManager= factory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(associate);
		entityManager.getTransaction().commit();
		entityManager.close();
		return account;
	}

	@Override
	public Account getDetails(long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account transactionEntry(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getAccountAllTransactions(long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int pinNumberTrialsUpdate(long accountNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPinTrials(long accountNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
