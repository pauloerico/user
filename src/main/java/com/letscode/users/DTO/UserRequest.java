package com.letscode.users.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    @NotNull
    private String name;
    @NotNull
    private String cpf;
    @NotNull
    private String password;
    @NotNull
    private String email;

}
