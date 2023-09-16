package br.com.kevin.api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.com.kevin.api.domain.model.User;
import br.com.kevin.api.domain.repository.UserRepository;
import br.com.kevin.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow((NoSuchElementException::new));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists!");
        }
        return userRepository.save(user);
    }

}
