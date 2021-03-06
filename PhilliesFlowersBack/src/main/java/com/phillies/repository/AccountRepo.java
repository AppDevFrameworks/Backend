package com.phillies.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.phillies.domain.Account;

public interface AccountRepo extends MongoRepository<Account, String> {
	public Account findByNameIgnoreCase(String name);
}