# ♟️ Projeto: Sistema de Jogo de Xadrez em Java

Este repositório contém o projeto do **Sistema de Jogo de Xadrez em Java**, desenvolvido durante o curso **Java COMPLETO - Programação Orientada a Objetos + Projetos**, do professor **Dr. Nélio Alves**.

📚 Curso: [Java COMPLETO - Udemy](https://www.udemy.com/course/java-curso-completo/)  
👨‍🏫 Professor: [Nélio Alves](http://educandoweb.com.br)  
🔗 Repositório original: [chess-system-design](https://github.com/acenelio/chess-system-design)

---

## 🎯 Objetivo Geral

Aplicar os conhecimentos de **Programação Orientada a Objetos** para desenvolver um sistema completo de **xadrez em console**, consolidando conceitos como:

- Encapsulamento
- Construtores
- Sobrecarga e Sobrescrita de métodos
- Herança e Polimorfismo
- Classes e métodos abstratos
- Enumerações
- Exceções personalizadas
- Padrão de camadas

---

## 🛠️ Tecnologias e Recursos Utilizados

- **Java SE 8+**
- **Orientação a Objetos (POO)**
- **Estruturas de Dados**
    - Matrizes
    - Listas (`List`)
- **Tratamento de Exceções**
- **Console UI com cores (Git Bash/Terminal compatível)**

---

## 🧱 Estrutura do Projeto

- **Camada de Tabuleiro (`board`)**
    - Classes: `Board`, `Position`, `Piece`, `BoardException`
- **Camada de Xadrez (`chess`)**
    - Classes: `ChessMatch`, `ChessPiece`, `ChessPosition`, `ChessException`
    - Enum: `Color`
    - Peças: `King`, `Rook`, `Bishop`, `Knight`, `Pawn`, `Queen`
- **Camada de Interface (`UI`)**
    - Impressão do tabuleiro e peças
    - Destaque de movimentos possíveis
- **Camada Principal (`application.Program`)**
    - Controle do fluxo do jogo

---

## ⚙️ Funcionalidades Implementadas

- ✅ Impressão do tabuleiro em console
- ✅ Colocação inicial das peças
- ✅ Movimentação de peças
- ✅ Validação de jogadas
- ✅ Controle de turnos e jogador atual
- ✅ Captura de peças e exibição das peças capturadas
- ✅ Verificação de **xeque** e **xeque-mate**
- ✅ Contagem de movimentos das peças
- ✅ **Movimentos especiais**:
    - Roque (Castling)
    - En Passant
    - Promoção de peão

---

## 📋 Exemplos de Conceitos Aplicados

- **Exceções personalizadas**: `BoardException`, `ChessException`
- **Programação defensiva** em métodos de validação
- **Polimorfismo**: cada peça possui sua própria implementação de movimentos possíveis
- **Métodos abstratos**: definição de `possibleMoves()` em `Piece` e implementação nas subclasses
