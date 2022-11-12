package com.rai.feign.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="FeignDemo", url="http://localhost:8081/user")
public interface FeignServiceUtil {

	@GetMapping("/name")
	String getName();
	
	@GetMapping("/address")
	String getAddress();
	
	@GetMapping("/status")
	String getStatus();
}
