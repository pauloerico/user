package com.letscode.users.DTO;

import com.letscode.users.model.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserResponse {

    private String name;
    private String cpf;
    private String password;
    private String email;
    private String uuid;

    public UserResponse(User user) {
        this.name = user.getName();
        this.cpf = user.getCpf();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.uuid = user.getUuid();
    }

}
