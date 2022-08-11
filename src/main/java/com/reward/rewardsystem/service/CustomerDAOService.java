package com.reward.rewardsystem.service;

import com.reward.rewardsystem.entity.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CustomerDAOService {

    private EntityManager entityManager;

    public long insert(Customer customer){
        entityManager.persist(customer);

        return customer.getAmount();
    }
}
