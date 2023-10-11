package br.com.lucasbrito.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    // Injeção de dependência do repositório de usuários
    @Autowired
    private IUserRepository userRepository;

    // Mapeamento de um endpoint para tratar requisições POST na rota '/users/'
    @PostMapping("/")
    public ResponseEntity creat(@RequestBody UserModel userModel) {
        // Buscar um usuário pelo nome de usuário no repositório
        var user = this.userRepository.findByUsername(userModel.getUsername());
        // Verificar se o usuário já existe
        if(user != null){
            // Se o usuário já existe, retornar uma resposta de erro com status 400 (Bad Request)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
        }
        // Se o usuário não existe, criar um novo usuário no repositório
        var userCreated =  this.userRepository.save(userModel);
        // Retornar uma resposta de sucesso com status 201 (Created) e o usuário criado
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
    
}
