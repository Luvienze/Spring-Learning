package com.luvienze.aopdemo.dao;

import com.luvienze.aopdemo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    boolean doWork ();
}
