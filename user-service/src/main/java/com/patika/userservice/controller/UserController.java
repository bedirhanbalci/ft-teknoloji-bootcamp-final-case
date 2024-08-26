package com.patika.userservice.controller;

import com.patika.userservice.dto.request.AuthLoginRequest;
import com.patika.userservice.dto.request.AuthRegisterRequest;
import com.patika.userservice.dto.request.UserRequest;
import com.patika.userservice.dto.response.GenericResponse;
import com.patika.userservice.dto.response.UserResponse;
import com.patika.userservice.dto.response.UserVO;
import com.patika.userservice.model.Role;
import com.patika.userservice.model.enums.RoleType;
import com.patika.userservice.service.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public GenericResponse<UserVO> createUserForAuth(@RequestBody AuthRegisterRequest request) {
        return GenericResponse.success(userService.createUserForAuth(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public GenericResponse<UserVO> validateUserForAuth(@RequestBody AuthLoginRequest request) {
        return GenericResponse.success(userService.validateUserForAuth(request), HttpStatus.OK);
    }

    @PutMapping()
    public GenericResponse<UserResponse> updateUser(@RequestBody UserRequest request) {
        return GenericResponse.success(userService.updateUser(request), HttpStatus.OK);
    }

    @GetMapping("/{email}/roles")
    public GenericResponse<Set<Role>> getUserRoles(@PathVariable String email) {
        return GenericResponse.success(userService.getUserRoles(email), HttpStatus.OK);
    }

    @PutMapping("/{email}/roles")
    public GenericResponse<UserResponse> addUserRoles(@PathVariable String email, @RequestBody List<RoleType> roleTypeList) {
        return GenericResponse.success(userService.addUserRoles(email, roleTypeList), HttpStatus.OK);
    }

    @DeleteMapping("/{email}/roles")
    public GenericResponse<UserResponse> deleteUserRoles(@PathVariable String email, @RequestBody List<RoleType> roleTypeList) {
        return GenericResponse.success(userService.deleteUserRoles(email, roleTypeList), HttpStatus.OK);
    }

    @GetMapping("/email")
    public GenericResponse<UserResponse> getUserByEmail(@RequestParam String email) {
        return GenericResponse.success(userService.getUserByEmail(email), HttpStatus.OK);
    }

    @GetMapping("/auth/email")
    public GenericResponse<UserVO> getUserByEmailForAuth(@RequestParam String email) {
        return GenericResponse.success(userService.getUserByEmailForAuth(email), HttpStatus.OK);
    }

    @GetMapping("/id")
    public GenericResponse<UserResponse> getUserById(@RequestParam Long id) {
        return GenericResponse.success(userService.getUserById(id), HttpStatus.OK);
    }

    @GetMapping
    public GenericResponse<List<UserResponse>> getAllUsers() {
        return GenericResponse.success(userService.getAllUsers(), HttpStatus.OK);
    }

}
