package br.com.atacadao.ecommerce.cliente.infra;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.atacadao.ecommerce.cliente.domain.Cliente;

public interface ClienteSpringDBMongoRepository extends MongoRepository<Cliente, UUID> {

}
