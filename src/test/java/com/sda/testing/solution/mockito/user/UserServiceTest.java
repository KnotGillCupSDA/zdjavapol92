package com.sda.testing.solution.mockito.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {

	private UserRepository mockRepository;
	private UserValidator mockValidator;
	private UserService userService;

	@BeforeEach
	void setUp() {
		mockRepository = Mockito.mock(UserRepository.class);
		mockValidator = Mockito.mock(UserValidator.class);
		userService = new UserService(mockRepository, mockValidator);
	}

	@ParameterizedTest
	@ValueSource(longs = {1, 45})
	void shouldFindUserById(Long id) {
		User givenUser = new User(id, "Jan", "Kowalski");

		when(mockRepository.findById(id))
				.thenReturn(Optional.of(givenUser));

		User returnedUser = userService.getUserById(id);

		assertNotNull(returnedUser);
		assertEquals(givenUser, returnedUser);
	}

	@Test
	void addValidUser() {

		//given
		User givenUser = new User(1L, "Jan", "Kowalski");
		when(mockValidator.isUserValid(givenUser)).thenReturn(true);
		when(mockRepository.addUser(givenUser))
				.thenReturn(givenUser);
		//when
		User returnedUser = userService.addUser(givenUser);
		//then
		verify(mockRepository, times(1)).addUser(givenUser);
		verify(mockValidator).isUserValid(givenUser);
		assertEquals(givenUser, returnedUser);
	}

}