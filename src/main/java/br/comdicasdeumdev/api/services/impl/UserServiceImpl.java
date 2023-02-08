package br.comdicasdeumdev.api.services.impl;

import br.comdicasdeumdev.api.domain.User;
import br.comdicasdeumdev.api.repositories.UserRespository;
import br.comdicasdeumdev.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRespository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
