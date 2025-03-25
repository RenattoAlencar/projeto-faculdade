# DevOps Project - Spring Boot CI/CD Pipeline  

![Java](https://img.shields.io/badge/Java-17-red?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green?logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.8-blue?logo=apache-maven)
![Docker](https://img.shields.io/badge/Docker-✔-blue?logo=docker)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-✔-2088FF?logo=github-actions)

A complete DevOps pipeline for a Spring Boot application demonstrating CI/CD best practices with Docker and GitHub Actions.

## 🚀 Features

- **Automated CI/CD Pipeline**
  - Compila, testa e faz deploy a cada push/PR
  - Versionamento semântico automático
- **Containerization**
  - Construção e otimização da imagem Docker
  - Pronto para deploy em qualquer registro de contêineres
- **Quality Assurance**
  - Testes unitários e de integração
  - Verificação do build
- **Infrastructure as Code**
  - Dockerfile para builds reproduzíveis
  - Workflow do GitHub Actions definido

## 📦 Pré-requisitos

Antes de começar, certifique-se de ter instalado::

| Tool | Version | Installation |
|------|---------|--------------|
| JDK | 17+ | [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/install/) |
| Maven | 3.8+ | [Maven Install Guide](https://maven.apache.org/install.html) |
| Docker | 20.10+ | [Docker Desktop](https://www.docker.com/products/docker-desktop) |
| Git | 2.30+ | [Git Downloads](https://git-scm.com/downloads) |

## 🛠️ Local Development Setup

### 1. Clonar o Repositório
```bash
git clone https://github.com/RenattoAlencar/projeto-faculdade.git
cd devops-project
```
### 2. Construir a Aplicação
```bash
mvn clean package
```
### 3. Criar a Imagem Docker
```bash
docker build -t devops-app:latest .
```
### 4. Executar o Contêiner
```bash
docker run -d -p 8080:8080 --name devops-container devops-app
```
 - **A aplicação estará disponível em:**
  [click here](http://localhost:8383/register/api/v1/search/)

## GitHub Actions

Este repositório contém uma configuração do GitHub Actions para:
    
   - **Build**: Construir o projeto com Maven.
   
   - **Versionamento**: Incrementar a versão do arquivo pom.xml.

   - **Docker**: Criar a imagem Docker.

   - **Testes**: Executar os testes automatizados.

### O fluxo de trabalho é acionado sempre que um pull request é aberto para a branch develop.
Como visualizar os logs do GitHub Actions

  - **1**: Vá para a aba Actions do repositório no GitHub.

  - **2**:  Selecione o fluxo de trabalho relacionado ao seu pull request.

  - **3**:  Visualize os logs de execução para ver como o pipeline foi executado.


 




