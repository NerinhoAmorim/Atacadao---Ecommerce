package br.com.atacadao.ecommerce.cliente.application.service;

import br.com.atacadao.ecommerce.cliente.application.api.ClienteIdResponse;
import br.com.atacadao.ecommerce.cliente.application.api.ClienteNovoRequest;

public interface ClienteService {
	ClienteIdResponse criaNovoCliente(ClienteNovoRequest clienteRequest);

}
