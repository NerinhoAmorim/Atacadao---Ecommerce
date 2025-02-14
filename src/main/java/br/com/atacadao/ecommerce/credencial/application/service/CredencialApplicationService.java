package br.com.atacadao.ecommerce.credencial.application.service;

import org.springframework.stereotype.Service;

import br.com.atacadao.ecommerce.credencial.application.repository.CredencialRepository;
import br.com.atacadao.ecommerce.credencial.domain.Credencial;
import br.com.atacadao.ecommerce.credencial.domain.CredencialAdmin;
import br.com.atacadao.ecommerce.credencial.domain.CredencialCliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class CredencialApplicationService implements CredencialService {

	private final CredencialRepository credencialRepository;

	@Override
	public void criaNovaCredencial(CredencialCliente clienteNovo) {
		log.info("[inicia] CredencialApplicationService - criaNovaCredencial");
		var novaCredencial = new Credencial(clienteNovo.getEmail(), clienteNovo.getSenha(), clienteNovo.getPerfil());
		credencialRepository.salva(novaCredencial);
		log.info("[finaliza] CredencialApplicationService - criaNovaCredencial");
	}

	@Override
	public void criaNovaCredencial(CredencialAdmin credencialAdmin) {
		log.info("[inicial] CredencialApplicationService - criaNovaCredencial");
		var novaCredencial = new Credencial(credencialAdmin.getEmail(), credencialAdmin.getSenha(),
				credencialAdmin.getPerfil());
		credencialRepository.salva(novaCredencial);
	}

}
