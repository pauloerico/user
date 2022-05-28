package com.letscode.users.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UserRequest {

    @NotNull
    @Schema(description = "Nome do usuário", example = "Julia Coder")
    private String name;

    @NotNull
    @CPF
    @Schema(description = "CPF do usuário", example = "08357451047")
    private String cpf;

    @NotNull
    @Schema(description = "Senha de usuário", example = "123456789")
    private String password;

    @NotNull
    @Email
    @Schema(description = "Email do usuário", example = "julia-coder@email.com")
    private String email;

    @NotNull
    @Schema(description = "Adress do usuário", example = "Rua dos Bobos, nº 0")
    private String adress;

}
