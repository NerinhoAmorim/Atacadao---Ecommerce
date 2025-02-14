package br.com.atacadao.ecommerce.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import br.com.atacadao.ecommerce.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteController implements ClienteAPI {

	private final ClienteService clienteService;

	@Override
	public ClienteIdResponse criaNovoCliente(ClienteNovoRequest clienteRequest) {
		log.info("[inicia] ClienteController - criaNovoCliente");
		ClienteIdResponse idCliente = clienteService.criaNovoCliente(clienteRequest);
		log.info("[finaliza] ClienteController - criaNovoCliente");
		return idCliente;
	}

}
