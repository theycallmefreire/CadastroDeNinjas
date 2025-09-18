# 🥷 Cadastro de Ninjas

Um projeto introdutório em **Spring Boot** para praticar conceitos de modelagem de entidades e relacionamentos usando o universo de **Naruto** como inspiração.

## 📌 Descrição

O sistema permite cadastrar ninjas e vinculá-los a missões. É possível:

- Criar ninjas.  
- Criar missões.  
- Relacionar **um ou vários ninjas a uma missão**.  
- Explorar relações do tipo **One-to-Many** e **Many-to-One** entre tabelas.  

Este projeto tem foco educacional, sendo uma introdução a conceitos de **Spring Boot**, **JPA** e **Lombok**, sem integração a um banco de dados real (as tabelas foram apenas modeladas no Java).

## ⚙️ Tecnologias utilizadas

- **Java**  
- **Spring Boot**  
- **Spring Data JPA** (para modelagem das entidades)  
- **Lombok** (para reduzir boilerplate de código)  

## 🗂️ Estrutura do projeto

- **Ninja** → entidade que representa um ninja.  
- **Missão** → entidade que representa uma missão.  
- Relacionamentos entre as entidades usando **JPA annotations**.  
