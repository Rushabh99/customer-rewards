package com.reward.rewardsystem.service;

import com.reward.rewardsystem.entity.Customer;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CustomerDAOServiceCommandLineRunner  implements CommandLineRunner {


    private static Logger log =  LoggerFactory.getLogger(CustomerDAOServiceCommandLineRunner.class);

    private CustomerDAOService customerDAOService;

    @Override
    public void run(String... args) throws Exception {

        Customer customer = new Customer(9,50, 8112022);
        int insert = customerDAOService.insert(customer);
        log.info("Customer added" +customer);

    }
}
