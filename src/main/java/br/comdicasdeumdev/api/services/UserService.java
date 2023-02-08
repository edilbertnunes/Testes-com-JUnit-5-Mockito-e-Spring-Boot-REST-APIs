package br.comdicasdeumdev.api.services;

import br.comdicasdeumdev.api.domain.User;

public interface UserService {
    User findById(Integer id);

}
