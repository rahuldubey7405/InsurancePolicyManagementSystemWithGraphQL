package com.InsurancePolicy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsurancePolicy.model.Policy;
import com.InsurancePolicy.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	public List<Policy> GetAllPolicy() {
		//
		return policyRepository.findAll();

	}

	public Optional<Policy> GetPolicy(int policyId) {
		return policyRepository.findById(policyId);

	}

	public Policy AddPolicy(Policy policy) {
		return policyRepository.save(policy);
	}

}
