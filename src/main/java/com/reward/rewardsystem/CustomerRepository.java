package com.reward.rewardsystem;

import com.reward.rewardsystem.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
