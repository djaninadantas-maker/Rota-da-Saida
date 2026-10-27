# A Rota da Saída

O jogo decorre num labirinto composto por 30 casas. Cada jogador controla um explorador e começa na posição 0, que representa a entrada do percurso. Os jogadores alternam os turnos e, em cada jogada, um dado aleatório gera um valor entre 1 e 6, determinando o número de casas a avançar.

Durante o percurso, os exploradores encontram casas especiais, como passagens secretas e armadilhas. Estas casas podem facilitar o avanço ou obrigar o jogador a recuar. Apenas um efeito especial é aplicado por turno, mesmo que o seu destino seja outra casa especial. Quando um explorador termina o movimento numa casa ocupada pelo adversário, este regressa ao início.

O objetivo é chegar exatamente à casa 30, que representa a saída do labirinto. Se o valor do dado fizer ultrapassar essa casa, o jogador permanece na posição anterior. Cada jogador dispõe de um máximo de 40 jogadas. Caso ninguém alcance a saída dentro desse limite, vence quem estiver mais próximo dela; se ambos estiverem na mesma posição, a partida termina empatada.

Este trabalho tem como objetivo aplicar os conceitos de Programação Orientada a Objetos na construção de um jogo funcional. O programa organiza-se em classes responsáveis pelos jogadores, pelo dado aleatório, pelo tabuleiro e pelo controlo da partida, permitindo desenvolver e testar as diferentes componentes do jogo.

## Autores

- Djanina Dantas - 30016799
- Liliane Santiago - 30016365
