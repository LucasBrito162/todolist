# Meu Projeto de Gerenciamento de Usuários

Este é um projeto de exemplo que demonstra um sistema de gerenciamento de usuários com um back-end em Java usando o Spring Framework e o Spring Data JPA.

## Descrição

Este projeto tem como objetivo fornecer uma API para criar, ler, atualizar e excluir usuários. Ele inclui operações básicas de CRUD e demonstra a integração com um banco de dados para armazenar informações do usuário.

## Funcionalidades

- Criar um novo usuário
- Buscar um usuário pelo nome de usuário
- Listar todos os usuários
- Atualizar informações do usuário
- Excluir um usuário

## Tecnologias Utilizadas

- Java
- Spring Framework
- Spring Data JPA
- Banco de Dados (H2)
- Lombok (para simplificar a criação de classes)

## Configuração e Uso

1. Clone o repositório para a sua máquina local.
2. Configure um banco de dados e atualize as informações de conexão no arquivo de propriedades.
3. Execute a aplicação.
4. Acesse a API por meio de um cliente REST (por exemplo, Postman) ou incorpore-a em um aplicativo da web.

## Exemplos de Uso

### Criar um Usuário

    POST /users/

      {

    "username": "novousuario",

    "name": "Novo Usuário",

    "password": "senha123"

    }

### Buscar um Usuário pelo Nome de Usuário
    GET /users/{username}

### Listar Todos os Usuários

    GET /users/

### Atualizar as Informações de um Usuário
    PUT /users/{username}

    {

    "name": "Novo Nome"

    }


## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) e enviar pull requests para melhorar este projeto.





