package com.airoli.euroschool.Euroschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airoli.euroschool.Euroschool.model.ParentDetails;

public interface ParentRepository extends JpaRepository<ParentDetails,Integer> {

}