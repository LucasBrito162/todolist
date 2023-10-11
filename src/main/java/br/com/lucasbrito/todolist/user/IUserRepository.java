package br.com.lucasbrito.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// Esta interface estende a interface JpaRepository, fornecida pelo Spring Data JPA, para realizar operações de persistência.
public interface IUserRepository extends JpaRepository<UserModel, UUID>{
    // Declaração de um método personalizado para buscar um usuário pelo nome de usuário.
   UserModel findByUsername(String username);
    
}
