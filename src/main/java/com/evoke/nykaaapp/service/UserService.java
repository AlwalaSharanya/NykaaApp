package com.evoke.nykaaapp.service;

import java.util.List;

import com.evoke.nykaaapp.dto.UserDto;

public interface UserService {
	public UserDto create(UserDto UserDto);

	public List<UserDto> getAll();

	public UserDto assignCartToPerson(Long cartid, Long personid);

	public UserDto update(UserDto UserDto);

	public Boolean delete(Long id);

	public UserDto getById(Long id);

}
