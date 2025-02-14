package br.com.atacadao.ecommerce.credencial.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.atacadao.ecommerce.cliente.application.api.ClienteNovoRequest;
import lombok.Getter;

@Getter
public class CredencialCliente {
	private String email;
	@Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
	private String senha;
	@NotNull
    Perfil perfil;
    
	public CredencialCliente(ClienteNovoRequest cliente) {
		this.email = cliente.getEmail();
		this.senha = cliente.getSenha();
		this.perfil = new Perfil(AuthorityUsuario.CLIENTE.name());
	}
	
}
