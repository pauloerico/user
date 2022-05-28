package com.letscode.users.service.impl;

import com.letscode.users.DTO.UserRequest;
import com.letscode.users.DTO.UserResponse;
import com.letscode.users.model.User;
import com.letscode.users.repository.UserRepository;
import com.letscode.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = new User(userRequest);
        User savedUser = userRepository.save(user);
        return new UserResponse(savedUser);
    }

    @Override
    public UserResponse findUserByUuid(String uuid) {

        User savedUser = userRepository.findByUuid(uuid);
        return new UserResponse(savedUser);
    }

    @Override
    public void deleteUserByUuid(String uuid) {
        User savedUser = userRepository.findByUuid(uuid);
        userRepository.delete(savedUser);
    }
}
