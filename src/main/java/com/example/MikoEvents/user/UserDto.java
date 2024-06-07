package com.example.MikoEvents.user;

import java.util.List;

import com.example.MikoEvents.token.Token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

	private String firstname;

	private String lastname;

	private String email;

	private String password;

	private Role role;

	private List<Token> tokens;
}
