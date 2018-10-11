package com.example.quartztest.dao;

import com.example.quartztest.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SportRepository extends JpaRepository<Sport, Integer> {

    @Query(" from Sport order by stepNumbers desc ")
    List<Sport> getAll();

    Sport findSportByAccount(String account);
}
