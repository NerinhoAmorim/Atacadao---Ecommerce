package br.com.atacadao.ecommerce.credencial.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.atacadao.ecommerce.credencial.domain.Credencial;

public interface CredencialMongoDBRepository extends MongoRepository<Credencial, UUID> {

}
