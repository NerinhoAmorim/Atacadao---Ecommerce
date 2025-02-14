package br.com.atacadao.ecommerce.cliente.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	
	@PostMapping(path = "/public/cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	@Operation(summary = "Cadastra novo Cliente")
	ClienteIdResponse criaNovoCliente(@RequestBody @Valid ClienteNovoRequest clienteRequest);

}
