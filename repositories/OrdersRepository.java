package com.springboottest.springboottest.repositories;


import com.springboottest.springboottest.models.Order;
import com.springboottest.springboottest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Integer> {

}
