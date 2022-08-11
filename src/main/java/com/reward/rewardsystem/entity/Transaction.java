package com.reward.rewardsystem.entity;


import javax.persistence.*;

@Entity
public class Transaction {


    @GeneratedValue
    @Id
    private int id;

    @ManyToOne(cascade= CascadeType.ALL)
    private Customer customerId;

    private int amount;

}
