package com.jb.fibonacci.resource.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jb.fibonacci.service.exception.ValorInferiorException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	final String VALOR_ERRADO_PARAMETRO_REQUEST =  "Valor errado, passado como parâmetro na request";
	
	@ExceptionHandler(ValorInferiorException.class)
	public ResponseEntity<StandardError> entidadeNaoEncontrada(ValorInferiorException expetion, HttpServletRequest request) {
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(VALOR_ERRADO_PARAMETRO_REQUEST);
		err.setMessage(expetion.getMessage());
		err.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<StandardError> numberFormatException(HttpServletRequest request) {
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(VALOR_ERRADO_PARAMETRO_REQUEST);
		err.setMessage("Não é possível gerar sequência fibonnaci de letra ou palavra");
		err.setPath(request.getRequestURI());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}

}
