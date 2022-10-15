package com.jb.fibonacci.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jb.fibonacci.DTO.FibonacciGeradoDTO;
import com.jb.fibonacci.mapper.FibonacciMapper;
import com.jb.fibonacci.model.FibonacciGerado;
import com.jb.fibonacci.service.exception.ValorInferiorException;

@Service
public class FibonacciService {

	@Autowired
	FibonacciMapper mapper;

	public FibonacciGeradoDTO gerarFibonacci(Integer number) {
		FibonacciGerado fg = new FibonacciGerado();
		List<Integer> fibonacci = new ArrayList<Integer>();

		fg.setNumero(number);

		if (number <= 1) {
			throw new ValorInferiorException("Número informado deve ser maior que 1");
		}

		fibonacci.add(0);
		fibonacci.add(1);

		for (int i = 2; i <= number; i++) {
			fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1));
		}

		fg.setSequencia(fibonacci);
		return mapper.toDTO(fg);
	}

}
