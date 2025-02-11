package br.com.atacadao.ecommerce.admin.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/admin")
public interface AdminAPI {
		@PostMapping("path/cadastro")
		@ResponseStatus(code = HttpStatus.NO_CONTENT)
		void criaCredencialAdmin(@RequestBody @Validated AdminRequest adminRequest);
}
