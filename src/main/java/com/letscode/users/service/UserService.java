package com.letscode.users.service;

import com.letscode.users.DTO.UserRequest;
import com.letscode.users.DTO.UserResponse;

public interface UserService {
    UserResponse createUser(UserRequest userRequest);

    UserResponse findUserByUuid(String uuid);

    void deleteUserByUuid(String uuid);
}
