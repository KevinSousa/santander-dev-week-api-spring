package br.com.kevin.api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kevin.api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
