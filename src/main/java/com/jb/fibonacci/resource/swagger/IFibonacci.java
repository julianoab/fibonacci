package com.jb.fibonacci.resource.swagger;


import org.springframework.http.ResponseEntity;

import com.jb.fibonacci.DTO.FibonacciGeradoDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;

@Api(value = "Gerar fibonacci")
public interface IFibonacci {
	
	@ApiResponse(code = 200, message = "Fibonnaci gerado com sucesso!")
	ResponseEntity<FibonacciGeradoDTO> gerarFibonacci(Integer n);


}
