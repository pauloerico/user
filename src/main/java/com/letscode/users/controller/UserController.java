package com.letscode.users.controller;

import com.letscode.users.DTO.UserRequest;
import com.letscode.users.DTO.UserResponse;
import com.letscode.users.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse createUser(UserRequest userRequest) {
        return userService.createUser(userRequest);
    }

    @GetMapping("/{uuid}")
    public UserResponse findUserByUuid(@PathVariable String uuid){
        return userService.findUserByUuid(uuid);
    }

    @DeleteMapping("/{uuid}")
    public void deleteUserByUuid(@PathVariable String uuid){
        userService.deleteUserByUuid(uuid);
    }
}
