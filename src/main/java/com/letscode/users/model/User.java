package com.letscode.users.model;

import com.letscode.users.DTO.UserRequest;
import com.letscode.users.repository.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@NoArgsConstructor
@Data
public class User {

    @Id
    private ObjectId id;

    private String uuid = UUID.randomUUID().toString();

    private String name;

    private String cpf;

    private String password;

    private String email;

    private String adress;

    public User(UserRequest userRequest){
        this.name = userRequest.getName();
        this.cpf = userRequest.getCpf();
        this.email = userRequest.getEmail();
        this.password = userRequest.getPassword();
        this.adress = userRequest.getAdress();
    }

}
