package com.patika.userservice.dto.request;

import com.patika.userservice.model.enums.Gender;
import com.patika.userservice.model.enums.UserType;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private String telephoneNumber;

    private UserType userType;

    private Gender gender;

}
