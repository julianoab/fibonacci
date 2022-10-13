package com.jb.fibonacci.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jb.fibonacci.resource.swagger.IFibonacci;
import com.jb.fibonacci.service.FibonacciService;

@RestController
@RequestMapping("/alticci/")
public class FibonacciResource implements IFibonacci {
	
	@Autowired
	private FibonacciService fibonacciService;
	
	@GetMapping("{n}")
	@Cacheable(value = "fibonacci")
	public ResponseEntity<List<Integer>> gerarFibonacci(@PathVariable Integer n) {
		return ResponseEntity.ok(fibonacciService.gerarFibonacci(n));
	}

}
