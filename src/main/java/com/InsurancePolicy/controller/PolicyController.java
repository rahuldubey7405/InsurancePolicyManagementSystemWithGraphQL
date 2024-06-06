package com.InsurancePolicy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.InsurancePolicy.model.Policy;
import com.InsurancePolicy.service.PolicyService;

@Controller
public class PolicyController {

	@Autowired
	private PolicyService policyService;

//	@GetMapping(value = "policy")
//	@SchemaMapping
	@QueryMapping("allPolicy")
	public List<Policy> GetPolicys() {
		System.out.println("start Policy======================");
		List<Policy> getAllPolicy = policyService.GetAllPolicy();
		System.out.println("getAllPolicy: " + getAllPolicy);
		return getAllPolicy;

//		return new ResponseEntity(getAllPolicy, HttpStatus.OK);
	}

	@QueryMapping("policy")
	public ResponseEntity<Policy> getPolicy(@Argument int policyId) {
		System.out.println("start Policy======================");
		Optional<Policy> getAllPolicy = policyService.GetPolicy(policyId);
		System.out.println("getAllPolicy: " + getAllPolicy);
		try {
			if (getAllPolicy.isPresent()) {
				System.out.println("getAllPolicy--------" + getAllPolicy);
				return ResponseEntity.ok(getAllPolicy.get());
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (Exception e) {
			return new ResponseEntity("Error in GetPolicy: " + e, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("policy")
	@ResponseBody
	public Policy AddPolicys(@RequestBody Policy policy) {
		System.out.println("startvvvvvvvvvvvvvvvvvvPolicy======================");
		Policy getAllPolicy = policyService.AddPolicy(policy);
		System.out.println("savePolicy: " + getAllPolicy);
		return getAllPolicy;

//		return new ResponseEntity(getAllPolicy, HttpStatus.OK);
	}

}
