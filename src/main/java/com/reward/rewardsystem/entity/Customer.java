package com.reward.rewardsystem.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @GeneratedValue
    @Id
    private int id;

    private int customerId;

    private int amount;

    private int orderDate;

    public Customer(){

    }

    public Customer( int customerId,int amount, int orderDate) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }


    public int getOrderDate() {return orderDate;}


//    @Override
//    public String toString() {
//        return "customer{" +
//                "id=" + id +
//                ", price=" + price +
//                ", reward_points=" + reward_points +
//                '}';
//    }


//    public int calculateRewards(price){
//        if(price >= 50 && price< 100) {
//            return price - 50;
//        }else if(price >100){
//            return (2*(price-100)+50);
//
//        }
//        return 0;
//    }

}


