package com.jb.fibonacci.service;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
	
	public List<Integer> gerarFibonacci(Integer number) {
		System.out.println("passou aqui");
		List<Integer> lista = new ArrayList<Integer>();
		Integer[] fibonacci = new Integer[number];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for (int i = 2; i < number; i++) {
			 fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
			  lista.add(fibonacci[i]);
			}
		return lista;
	}

}
