# Universal Mode Game

**Sobre o projeto**

Jogo de luta simples desenvolvido em Java como projeto pessoal, com o objetivo de praticar conceitos fundamentais da linguagem (POO, encapsulamento, laços de repetição, etc). Não é um projeto profissional nem finalizado — apenas um exercício próprio de aprendizado.

**Como funciona**

O jogador define os atributos (nome, força e defesa) de dois campeões, que então entram em confronto. Ao final, o sistema exibe o vencedor e o dano causado.

**Funcionalidades**

- Criação de dois campeões com atributos personalizáveis
- Sistema de batalha baseado em força e defesa
- Item especial "Sword of God": possui uma chance percentual de aparecer na partida e é sorteado aleatoriamente para um dos campeões, concedendo dano extra

**Tecnologias usadas**

- Java (JDK)
- Biblioteca `Scanner` (entrada de dados via terminal)
- Biblioteca `Random` (sorteio da chance de drop da "Sword of God")
- Swing (`JOptionPane`) para exibir o resultado final da batalha em uma janela

**Como usar**

1. Execute a classe `Universal` (ela contém o `main`)
2. Digite o **nome**, a **força** e a **defesa** do primeiro campeão, quando solicitado
3. Repita o processo para o segundo campeão
4. A batalha acontece automaticamente e o resultado (vencedor e dano causado) é exibido no console e em uma janela pop-up
5. Ao final, escolha `true` para jogar novamente ou `false` para encerrar

**Status**

🚧 Projeto em desenvolvimento — feito apenas para fins de estudo e prática pessoal.
