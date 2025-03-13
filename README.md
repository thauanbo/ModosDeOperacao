
# Trabalho Simulação de um Sistema Operacional 

Este projeto é uma simulação de um sistema operacional simples, desenvolvido para demonstrar a diferença entre operações em nível de usuário e kernel. O código foi estruturado para ilustrar como um sistema operacional gerencia diferentes níveis de acesso e operações, além de fornecer um preview em tempo real das mudanças entre os modos de operação.

## Funcionalidades

- Adicionado Operações a Nivel de Usuario : ligar, desligar, abrirMenu, fecharMenu;

- Adicinado uma Operação a Nivel de Kernel : criarProcesso;

- Caso tenha um acesso ao criarProcesso, o Modo sera alterado atraves do alterarModo para o Nivel Kernel;

- Preview em tempo real da mudança entre o Modos de Operações;

-Sistema

- Código estruturado para simular o comportamento de um sistema operacional, com operações específicas para cada nível de acesso. 


## Estrutura do Projeto

```
simulacao-sistema-operacional/
├── src/
│   └── org/
│       └── example/
│           └── metodos/
│               ├── Sistema.java
│               ├── Modos.java
│               └── Main.java
├── README.md
└── LICENSE
```
## Stack utilizada

**Back-end:** 
Java


## Clone o Projeto

```bash
  git clone https://github.com/thauanbo/ModosDeOperacao.git
```
## Uso/Exemplos

```java
    public static void main(String[] args) {
        Modos m = new Modos();

        m.modo();
        m.ligar();
        m.criarProcesso();
    }
```
```
Modo atual: usuario
Ligando no modo usuario...
Abrindo menu no modo usuario...
Fechando menu no modo usuario...
Desligando no modo usuario...
Acesso negado. Alterando para modo kernel...
Modo alterado para: kernel
Criando processo no modo kernel...
Modo atual: kernel
Criando processo no modo kernel...
```

