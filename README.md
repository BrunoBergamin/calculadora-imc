# Calculadora de IMC em Java

Status: projeto de pratica em Java puro.

Projeto simples em Java com interface grafica via `JOptionPane` para calcular o IMC (Indice de Massa Corporal) a partir do peso e da altura informados pelo usuario.

## Visao geral

Este e um exercicio de pratica para reforcar fundamentos de Java. A ideia aqui nao foi criar um sistema grande, e sim treinar um fluxo pequeno e completo:

- leitura de dados com janelas simples
- validacao de entrada
- separacao da logica em metodos
- condicionais para classificacao
- formatacao de resultado para exibicao ao usuario

## Funcionalidades

- recebe peso e altura em caixas de dialogo
- valida se os valores sao maiores que zero
- calcula o IMC com a formula padrao
- classifica o resultado em faixas como:
  - abaixo do peso
  - peso normal
  - sobrepeso
  - obesidade grau I, II e III
- exibe mensagens de erro para entradas invalidas

## Tecnologias

- Java
- Swing (`JOptionPane`)

## Estrutura

```text
calculadora-imc/
|-- src/
|   `-- progam/
|       `-- Main.java
`-- README.md
```

## Como executar

### Opcao 1: IDE

Abra o projeto no IntelliJ IDEA ou em outra IDE Java e execute a classe:

```text
src/progam/Main.java
```

### Opcao 2: terminal

Se preferir, compile e execute pelo terminal dentro da pasta do projeto:

```bash
javac -d out src/progam/Main.java
java -cp out program.Main
```

## O que foi praticado

- Java puro, sem frameworks
- organizacao basica de um programa Java
- uso de `try/catch` para tratar erro de entrada
- criacao de metodos para leitura, calculo, classificacao e exibicao de erro
- aplicacao de regras de negocio simples com `if/else`

## Limitacoes atuais

- o projeto tem apenas uma classe principal
- nao ha testes automatizados
- a interface e propositalmente simples, focada em pratica
- o tratamento de entrada ainda pode evoluir para aceitar mais formatos

## Melhorias futuras

- permitir uso de virgula como separador decimal
- adicionar historico de calculos
- criar uma interface mais completa com Swing ou JavaFX
- incluir testes automatizados para a regra de classificacao

## Autor

Projeto desenvolvido por Bruno Bergamin como parte dos estudos em Java e logica de programacao.
