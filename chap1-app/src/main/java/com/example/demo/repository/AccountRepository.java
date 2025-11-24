package com.example.demo.repository;

import com.example.demo.model.Account;

public interface AccountRepository 
{

	Account findById(long fromid);

}
