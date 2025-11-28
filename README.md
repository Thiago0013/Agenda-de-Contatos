# Agenda de Contatos – API (Spring Boot)

API simples feita com **Spring Boot** para gerenciar usuários e contatos.
Projeto criado para estudo de Java, API REST e organização de backend.

---

## 🚀 Tecnologias

* Java **21**
* Spring Boot
* Spring Web
* Spring Data JPA
* **MySQL**
* Maven

---

## 🗄️ Banco de Dados (Importante)

Para a aplicação funcionar corretamente, você precisa ter um **banco de dados MySQL ativo** rodando no sistema.

Crie um banco (pode ser com o nome que você quiser, ex: `agenda_contatos`) e configure o usuário e a senha no arquivo:

```
src/main/resources/application.properties
```

Exemplo de configuração:

```
spring.datasource.url=jdbc:mysql://localhost:3306/agenda_contatos
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📌 Endpoints

### 👤 Usuário (`/api/usuario`)

#### **POST /api/usuario**

Cria um novo usuário.

**JSON aceito:**

```json
{
  "nome": "teste",
  "email": "teste@gmail.com"
}
```

#### **GET /api/usuario**

Lista todos os usuários.

---

### 📇 Contato (`/api/contato`)

#### **POST /api/contato**

Cria um contato vinculado a um usuário existente.

**JSON aceito:**

```json
{
  "nome": "testecontato",
  "email": "testecontato@gmail.com",
  "telefone": "123456789",
  "idUsuario": 1
}
```

#### **GET /api/contato**

Lista todos os contatos cadastrados.

---

## ▶️ Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/Thiago0013/Agenda-de-Contatos.git
```

2. Acesse a pasta:

```bash
cd Agenda-de-Contatos
```

3. Execute o projeto:

```bash
./mvnw spring-boot:run
```

Ou inicie pela sua IDE.

A API ficará disponível em:

```
http://localhost:8080
```

---

## 👤 Autor

Projeto criado para estudo por **Thiago**.
GitHub: (https://github.com/Thiago0013)
