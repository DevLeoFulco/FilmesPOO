# Projeto de Gerenciamento de Filmes e Séries

## Sobre o Projeto
Este projeto é um sistema de gerenciamento de conteúdo de entretenimento que permite aos usuários interagir com filmes e séries, classificá-los e receber recomendações com base em suas visualizações e avaliações.

## Conceitos de Orientação a Objetos Utilizados
- **Encapsulamento**: Atributos privados e métodos públicos são usados para proteger e controlar o acesso aos dados dos objetos.
- **Herança**: A classe `Filmes` herda da classe `Titulo`, permitindo o reuso e a extensão de funcionalidades.
- **Polimorfismo**: A interface `Classificar` é implementada por várias classes, permitindo que objetos de diferentes classes sejam tratados de forma uniforme.
- **Abstração**: Interfaces e classes abstratas são usadas para definir contratos e representar conceitos gerais como `Titulo` e `Classificar`.

## Linguagem de Programação
O projeto foi desenvolvido em **Java**, aplicando conceitos de orientação a objetos.

## Funcionamento do Sistema
O sistema permite criar e manipular objetos representando filmes, séries e episódios. Os usuários podem avaliar esses títulos, e o sistema calcula médias de avaliações e fornece recomendações baseadas na classificação dos títulos.

## Como Rodar o Projeto na Sua Máquina
Para executar o sistema em sua máquina, siga os passos abaixo:

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone o repositório do projeto para o seu computador local.
3. Navegue até o diretório do projeto via terminal ou prompt de comando.
4. Compile o código-fonte com o comando `javac br/com/devleofulco/projetofilmes/model/*.java br/com/devleofulco/projetofilmes/calculos/*.java`.
5. Execute a aplicação principal com o comando `java br.com.devleofulco.projetofilmes.principal.Principal` (substitua `Principal` pelo nome da sua classe principal).

Desfrute do sistema de gerenciamento de filmes e séries para organizar e avaliar seu conteúdo favorito!
