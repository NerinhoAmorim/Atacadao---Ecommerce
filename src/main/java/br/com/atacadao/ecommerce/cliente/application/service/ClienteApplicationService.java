package br.com.atacadao.ecommerce.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.atacadao.ecommerce.cliente.application.api.ClienteIdResponse;
import br.com.atacadao.ecommerce.cliente.application.api.ClienteNovoRequest;
import br.com.atacadao.ecommerce.cliente.application.repository.ClienteRepository;
import br.com.atacadao.ecommerce.cliente.domain.Cliente;
import br.com.atacadao.ecommerce.credencial.application.service.CredencialService;
import br.com.atacadao.ecommerce.credencial.domain.CredencialCliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;
	private final CredencialService credencialService;

	@Override
	public ClienteIdResponse criaNovoCliente(ClienteNovoRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaNovoCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		credencialService.criaNovaCredencial(new CredencialCliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaNovoCliente");
		return ClienteIdResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

}
