package br.com.atacadao.ecommerce.autenticacao.application.api;

import br.com.atacadao.ecommerce.autenticacao.domain.Token;
import lombok.Value;

@Value
public class TokenResponse {
	private String token;
	private String tipo;

	public TokenResponse(Token token) {
		this.token = token.getTipo();
		this.tipo = token.getTipo();
	}

}
