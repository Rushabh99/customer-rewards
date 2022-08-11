package com.reward.rewardsystem.service;

import com.reward.rewardsystem.entity.Customer;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CustomerDAOServiceCommandLineRunner  implements CommandLineRunner {


    private CustomerDAOService customerDAOService;
    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer();

    }
}
