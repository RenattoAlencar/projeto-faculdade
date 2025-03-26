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
cd projeto-faculdade
```
### 2. Construir a Aplicação
```bash
git switch feature/devops-pipeline
```
### 3. Construir a Aplicação
```bash
mvn clean package
```
### 4. Processo de build.
A alterar a versão do pom.

### 5. Mande a alteração para a stage (Cuuidado com as alterações, estou usando o git add (.), para enviar tudo).
```bash
git add .
```
### 6. Commit essa alteração
```bash
git commit -m "build:(increment version pom)"
```
### 7. Commit essa alteração
```bash
git commit -m "build:(increment version pom)"
```
### 8. Atualizar repositorio remoto
```bash
git push
```
### 9 - O fluxo de trabalho é acionado sempre que um pull request é aberto para a branch develop.
Como visualizar os logs do GitHub Actions

  - **1**: Vá para a aba Actions do repositório no GitHub.

  - **2**: Realize um pull request da brach: feature/devops-pipeline para a branch: develop.

  - **3**:  Selecione o fluxo de trabalho relacionado ao seu pull request.

  - **4**:  Visualize os logs de execução para ver como o pipeline foi executado.
    
  - **5**:  Aprove o merge.

### 10. Voltar para a branch develop
```bash
git switch develop
```
### 10. Atuualizar com as mudanças realizadas
```bash
git pull
```

### 11. Criar a Imagem Docker
```bash
docker build -t devops-app:latest .
```
### 12. Executar o Contêiner
```bash
docker run -d -p 8080:8080 --name devops-container devops-app
```
 - **A aplicação estará disponível em:**
  [click here](http://localhost:8080/register/api/v1/search)
OBS: Alguns navegadores precisará carregar aperte [ENTER] ou F5 na URL

## GitHub Actions

Este repositório contém uma configuração do GitHub Actions para:
    
   - **Build**: Construir o projeto com Maven.
   
   - **Docker**: Criar a imagem Docker.

   - **Testes**: Executar os testes automatizados.


 




