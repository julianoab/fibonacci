package com.jb.fibonacci.mapper;

import org.springframework.stereotype.Service;

import com.jb.fibonacci.DTO.FibonacciGeradoDTO;
import com.jb.fibonacci.model.FibonacciGerado;

@Service
public class FibonacciMapper {
	
	public FibonacciGerado toEntity(FibonacciGeradoDTO fibonacciGeradoDTO) {
		FibonacciGerado fb = new FibonacciGerado();
		fb.setNumero(fibonacciGeradoDTO.getNumero());
		fb.setSequencia(fibonacciGeradoDTO.getSequencia());
		return fb;
	}
	
	public FibonacciGeradoDTO toDTO (FibonacciGerado fibonacciGerado) {
		FibonacciGeradoDTO fbDTO = new FibonacciGeradoDTO();
		fbDTO.setNumero(fibonacciGerado.getNumero());
		fbDTO.setSequencia(fibonacciGerado.getSequencia());
		return fbDTO;
	}

}
