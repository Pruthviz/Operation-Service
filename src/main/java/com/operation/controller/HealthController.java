package com.operation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operation.dto.Health;
import com.operation.util.Constants;

@RestController
@RequestMapping(value = Constants.BASE_URL)
public class HealthController {

	@GetMapping(value = "/health")
	public Health healthCheck() {
		return new Health(Constants.SERVICE_NAME, "operation-service is healthy", HttpStatus.OK.value());
	}

}
