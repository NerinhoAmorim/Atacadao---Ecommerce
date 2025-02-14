package br.com.atacadao.ecommerce.credencial.application.service;

import br.com.atacadao.ecommerce.credencial.domain.CredencialAdmin;
import br.com.atacadao.ecommerce.credencial.domain.CredencialCliente;

public interface CredencialService {
	void criaNovaCredencial(CredencialCliente cliente);
	void criaNovaCredencial(CredencialAdmin credencialAdmin);


}
