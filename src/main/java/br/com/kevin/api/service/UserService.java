package br.com.kevin.api.service;

import br.com.kevin.api.domain.model.User;

public interface UserService {
    User findById(Long id);

    void delete(Long id);

    User create(User user);
}
