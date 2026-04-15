fun calcularImc(view: View) {
        // PASSO 1: LOCALIZAÇÃO
        // "Ei Android, procure na tela um componente de texto com o ID 'textResultado' e guarde aqui."
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura = findViewById<EditText>(R.id.editAltura)

        // PASSO 2: CAPTURA
        // "Pegue o que foi digitado, transforme em texto comum (String) e guarde nas variáveis."
        val sPeso = editPeso.text.toString()
        val sAltura = editAltura.text.toString()

        // PASSO 3: A SEGURANÇA (VALIDAÇÃO)
        // O 'if' é como um segurança. Ele só deixa o código passar se a condição for real.
        // 'isNotEmpty()' significa: Não está vazio?
        // '&&' significa: E também.

        if (sPeso.isNotEmpty() && sAltura.isNotEmpty()) {

         // PASSO 4: TRANSFORMAÇÃO
         // O computador não entende que o texto "80" é um número.
         // O 'toDouble()' converte o texto em um número decimal (que aceita vírgula).
         val pesoVal = sPeso.toDouble()
         val alturaVal = sAltura.toDouble()

         // PASSO 5: A MATEMÁTICA
         // IMC é o Peso dividido pela Altura ao quadrado (Altura vezes Altura).
         val resultado = pesoVal / (alturaVal * alturaVal)

         // PASSO 6: MOSTRAR O RESULTADO
         // '%.2f' é um código para dizer mostre só 2 números depois da vírgula
         //Essa variável cria a gaveta vazia onde irá guardar as informações e fazer as perguntas de
         var informativo = ""

         //Aqui fazemos a pergunta
         if (resultado < 18.5) {
                informativo = "está abaixo do peso"
            } else if (resultado < 25.0) {
                informativo = "está com peso normal"
            } else {
                informativo = "está acima do peso"
            }

            //Agora exibimos a mensagem na tela mostrando o resultado da pergunta

            textResultado.text = "Seu IMC é %.2f e você $informativo".format(resultado)

    }}}