package com.jb.fibonacci.resource.swagger;

import org.springframework.http.ResponseEntity;
import com.jb.fibonacci.DTO.FibonacciGeradoDTO;
import com.jb.fibonacci.resource.exception.StandardError;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface IFibonacci {
	
	@ApiOperation(value = "Gerar sequência fibonacci")
	@ApiResponses(value = {
	@ApiResponse(code = 200, message = "Fibonnaci gerado com sucesso!"),
	@ApiResponse(code = 400, message = "Dado informado para a requisição estão inconsistente", response = StandardError.class )})
	ResponseEntity<FibonacciGeradoDTO> gerarFibonacci(Integer n);


}
