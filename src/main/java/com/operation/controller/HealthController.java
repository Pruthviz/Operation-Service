package com.operation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operation.dto.Health;
import com.operation.util.OperationConstants;

@RestController
@RequestMapping(value = OperationConstants.BASE_URL)
public class HealthController {

	@GetMapping(value = "/health")
	public Health getPing() {
		return new Health(OperationConstants.SERVICE_NAME, OperationConstants.SERVICE_NAME + " is healthy",
				HttpStatus.OK.value());
	}

}
