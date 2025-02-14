package br.com.atacadao.ecommerce.cliente.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Indexed;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ClienteNovoRequest {
	@NotBlank(message = "Campo nome não pode está vazio.")
	@Schema(description = "Este é o nome do cliente", example = "Carlos Henrique")
	private String nome;
	@Email
	@NotNull(message = "Campo email não pode ser nulo.")
	@Schema(description = "Este é o E-mail do cliente", example = "car_henrique@gmail.com")
	private String email;
	@NotNull
	@Size(min = 6, max = 10, message = "Digite novamente a senha.")
	@Schema(description = "Esta é a senha do cliente", example = "123456")
	private String senha;
	@NotNull(message = "Digite novamente o sexo.")
	@Schema(description = "Este é o sexo do cliente", example = "Masculino")
	private String sexo;
	@NotNull(message = "Digite novamente a data de nascimento.")
	@Schema(description = "Esta é a data de nascimento do cliente", example = "2006-12-05")
	private String dataNascimento;

}
