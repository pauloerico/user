package com.letscode.users.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@NoArgsConstructor
@Data
public class User {

    @Id
    private Long id;

    private String name;

    private String cpf;

    private String password;

    private String email;

    private String uuid = UUID.randomUUID().toString();
}
