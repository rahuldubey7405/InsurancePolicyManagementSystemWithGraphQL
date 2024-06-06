package com.InsurancePolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InsurancePolicy.model.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

}
