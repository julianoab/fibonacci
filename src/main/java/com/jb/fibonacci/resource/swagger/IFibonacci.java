package com.jb.fibonacci.resource.swagger;

import java.util.List;

import org.springframework.http.ResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@Api(value = "Gerar fibonacci")
public interface IFibonacci {
	
	@ApiResponse(code = 200, message = "Fibonnaci gerado com sucesso!")
	ResponseEntity<List<Integer>> gerarFibonacci(Integer n);


}
