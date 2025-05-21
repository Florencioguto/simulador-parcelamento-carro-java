🚗 Simulador de Parcelamento de Carro (Java)
Este projeto é um simulador de parcelamento simples feito em Java que permite ao usuário calcular o número máximo de parcelas possíveis para a compra de um carro, baseado no valor mínimo de R$1000 por parcela. Além disso, o programa calcula o valor total com juros e exibe os detalhes do parcelamento, de forma clara no terminal.

🧠 Funcionalidades
Solicita o valor do carro ao usuário.

Calcula o número máximo de parcelas possíveis (mínimo R$1000 por parcela).

Pergunta se o usuário deseja parcelar e quantas parcelas quer (até o limite).

Aplica uma taxa de juros fixa de 14% ao valor total.

Exibe o valor de cada parcela e o valor final com juros.

📸 Exemplo de uso
Digite o valor do carro: 
20000
O carro pode ser parcelado em até 20 vezes.
Deseja parcelar? (S/N): S
Digite a quantidade de parcelas desejada (1 a 20): 5

--- Detalhes do Parcelamento ---
Parcela 01: R$ 4560.00
Parcela 02: R$ 4560.00
Parcela 03: R$ 4560.00
Parcela 04: R$ 4560.00
Parcela 05: R$ 4560.00
Valor total com juros (14%): R$ 22800.00
--------------------------------
🛠️ Tecnologias usadas
Java 17+

Entrada via terminal (Scanner)

📂 Como executar
Certifique-se de ter o Java instalado (versão 17 ou superior).

Clone este repositório:

bash
Copiar
Editar
git clone https://github.com/Florencioguto/simulador-parcelamento-carro-java.git
Compile e execute o código:

bash
Copiar
Editar
javac SimuladorDeParcelamentoDeCarro.java
java SimuladorDeParcelamentoDeCarro
🎓 Sobre
Este projeto faz parte da minha prática de lógica de programação com Java. Ele foi pensado como uma forma simples de aplicar estruturas de repetição, condicionais e entrada de dados com Scanner. A ideia é simular situações reais como compra financiada com juros fixos.

