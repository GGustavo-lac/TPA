# 🎲 Jogo AdivinhaNúmero

Um jogo simples em Java onde o usuário tenta adivinhar um número secreto entre **1 e 10**.  
O programa dá dicas se o número secreto é **mais alto** ou **mais baixo** e contabiliza o número de tentativas.

---

## 📝 Descrição

O **AdivinhaNúmero**:
- Gera aleatoriamente um número secreto de 1 a 10.
- Solicita palpites do usuário até acertar.
- Informa se o número secreto é maior ou menor que o palpite.
- Exibe o número de tentativas ao final.

---

## 🖥️ Exemplo de Execução

![Execução do programa](adivinha_numero_execucao_branco.png)

---

## 📂 Estrutura do Código

- **Random**: para gerar o número secreto.
- **Scanner**: para receber entrada do usuário.
- **do...while**: para repetir as tentativas até o acerto.

---

## 📜 Código Principal

```java
Random variavel = new Random();
int numeroSecreto = variavel.nextInt(1, 11); // número aleatório entre 1 e 10
Scanner scanner = new Scanner(System.in);
