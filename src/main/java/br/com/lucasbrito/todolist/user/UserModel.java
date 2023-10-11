package br.com.lucasbrito.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // Anotação Lombok para gerar automaticamente métodos getters, setters, equals, hashCode e toString.
@Entity(name = "tb_users") // Indica que esta classe é uma entidade JPA mapeada para a tabela 'tb_users'.
public class UserModel {

    @Id // Marca o campo 'id' como a chave primária da entidade.
    @GeneratedValue(generator = "UUID") // Gera valores UUID para o campo 'id'.
    private UUID id; // Representa o identificador único do usuário.

    @Column(unique = true)    // Indica que o campo 'username' deve ser único na tabela.
    private String username; 

    private String name;
    private String password;

    @CreationTimestamp // Usado para marcar o campo 'createdAt' para ser preenchido automaticamente com a data e hora de criação.
    private LocalDateTime createdAt; // Armazena a data e hora de criação do usuário.
    
    
}
