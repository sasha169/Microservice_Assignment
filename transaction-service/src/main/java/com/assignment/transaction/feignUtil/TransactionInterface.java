package com.assignment.transaction.feignUtil;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("STUDENT-SERVICE")
public interface TransactionInterface {

	@GetMapping("student/details/{id}")
	public int getDetails(@PathVariable Integer id);

}
