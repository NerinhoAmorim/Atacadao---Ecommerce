package br.com.atacadao.ecommerce.cliente.infra;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.atacadao.ecommerce.cliente.application.repository.ClienteRepository;
import br.com.atacadao.ecommerce.cliente.domain.Cliente;
import br.com.atacadao.ecommerce.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDBMongoRepository clienteSpringDBMongoRepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		try {
			clienteSpringDBMongoRepository.save(cliente);
		} catch (DataIntegrityViolationException ex) {
			throw APIException.build(HttpStatus.BAD_REQUEST, "Cliente já cadastrado.");
		}
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
