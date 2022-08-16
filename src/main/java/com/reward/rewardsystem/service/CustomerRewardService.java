package com.reward.rewardsystem.service;


import com.reward.rewardsystem.CustomerRepository;
import com.reward.rewardsystem.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerRewardService {

    @Autowired
    CustomerRepository customerRepository;


//    public List<Customer> findAll(){
//        return customerRepository.findAll();
//    }

    public Customer getPersonById(int id) {
        return customerRepository.findById(id).get();
    }
    public void saveOrUpdate(Customer customer){
        customerRepository.save(customer);

    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }




//    public int getRewardByCustomerId(int customerId){
//
//    }

}
