package br.com.atacadao.ecommerce.credencial.domain;

import org.springframework.security.core.GrantedAuthority;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Perfil implements GrantedAuthority {

    private String nome;

    @Override
    public String getAuthority() {
        return this.nome;
    }

    private static final long serialVersionUID = 1L;
}