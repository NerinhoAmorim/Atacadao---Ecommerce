package br.com.atacadao.ecommerce.credencial.infra;

import org.springframework.stereotype.Repository;

import br.com.atacadao.ecommerce.credencial.application.repository.CredencialRepository;
import br.com.atacadao.ecommerce.credencial.domain.Credencial;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
@Slf4j
public class CredencialRepositoryPosteGreSQL implements CredencialRepository {
	private final CredencialMongoDBRepository credencialMongoDBRepository;

	@Override
	public Credencial salva(Credencial credencial) {
		log.info("[inicia] CredencialRepositoryPosteGreSQL - salva");
		credencialMongoDBRepository.save(credencial);
		log.info("[finaliza] CredencialRepositoryPosteGreSQL - salva");
		return credencial;

	}

}
