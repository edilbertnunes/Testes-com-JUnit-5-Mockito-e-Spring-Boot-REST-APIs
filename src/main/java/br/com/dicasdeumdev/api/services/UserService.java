package br.com.dicasdeumdev.api.services;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.domain.dto.UserDto;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDto obj);
    User update(UserDto obj);
    void delete(Integer id);
}