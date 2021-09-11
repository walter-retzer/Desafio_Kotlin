package Classes

import java.lang.Exception


class DigitalHouseManger() {

// Parte G - Item01: Criar um diagrama de classes que modele a classe DigitalHouseManager.
// A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de professores,
// uma lista de cursos e uma lista de matrículas

    // usado o Map para armazenar o codigoDoCurso na posição chave e na posição chave: nomeDoCurso, quantidadeMáximaAlunos
    // listaDeCursos = {key = codigoDoCurso, value: nomeDoCurso, quantidadeMaximaAlunos}
    var listaDeCurso = mutableMapOf<Int, List<Any>>()

    // lista aux para armazenar nomeDoCurso e quantidadeMaximaAlunos como lista.
    var listaAuxCurso = mutableListOf<Any>() // listaAuxCurso = [nomeDoCurso, quantidadeMaximaAlunos]

    // a listaDeProfessores receberá dados do códigoProfessor e uma Lista de dados de Professores Titular ou Adjuntos:
    // listaDeProfessores = {key = codigoProfessor, value: listaAuxProfessorAdjunto[]}
    // listaDeProfessores = {key = codigoProfessor, value: listaAuxProfessorTitular[]}
    var listaDeProfessores = mutableMapOf<Int, List<Any>>()

    // Lista Auxiliares que serão utilizadas nas conversões e acesso aos dados da listaDeProfessores:
    // listaAuxProfessoresAdjuntos = [nome do professor, o sobrenome, quantidade de horas disponíveis para monitoria, tempoDeCasa]
    var listaAuxProfessoresAdjuntos = mutableListOf<Any>()

    // listaAuxProfessores = [nome do professor, o sobrenome, o código e a especialidade, tempoDeCasa]
    var listaAuxProfessoresTitular = mutableListOf<Any>()

    // a listaDeAlunos receberá dados do códigoAluno e uma Lista de dados contendo nome e sobrenome do Aluno:
    // listaAlunos = {key = codigoDoAluno, value = listaAuxAlunos[]}
    var listaAlunos = mutableMapOf<Int, List<String>>()

    // listaAuxAlunos = [nome, sobrenome]
    var listaAuxAlunos = mutableListOf<String>()


    // A listaMatriculas será um Map que a chave receberá uma listaDeCurso e na posição valor receberá uma listaAluno,
    // de acordo com o código do curso e código do aluno.
    // listaMatriculas = {key = listaDeCursos[], value = listaAuxAlunos[]}
    var listaMatriculas = mutableMapOf<List<Any>, List<Any>>()


    // Parte I - Item01: Criar um método na classe DigitalHouseManager que permita registrar um curso.
    // O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    // O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos.

    // função registrarCurso:
    fun registrarCurso(nomeDoCurso: String, codigoDoCurso: Int, quantidadeMaximaAlunos: Int) {
        // listaAuxCurso recebe os parametros nomeDoCurso: String e quantidadeMáximaAlunos: Int
        // listaAuxCurso[codigoDoCurso, quantidadeMaximaAlunos]
        listaAuxCurso = mutableListOf(nomeDoCurso, quantidadeMaximaAlunos)
        // insere os dados na lista de curso:
        listaDeCurso.put(codigoDoCurso, listaAuxCurso) // listaDeCurso = {key = codigoDoCurso, value: listaAuxCurso}
        println("Lista de Curso: ${listaDeCurso}")
    }

    // Parte I - Item02: Criar um método na classe DigitalHouseManager que permita excluir um curso.
    // O método recebe como parâmetro o código do curso. O método deve utilizar o código do curso para encontrá-lo
    // na lista de cursos e excluí-lo da lista.

    fun excluirCurso(codigoDigitado: Int) {
        //variavel aux para verificar se há na lista de curso contém o código digitado
        var auxChecaCodigoDigitado = false
        // variavel auxiliar que armazena a posição da chave, caso haja o código digitado
        var auxArmazenaPosicaoChave = 0

        // utilização de loop for para passar pelos itens da lista de cursos:
        for (codigo in listaDeCurso) {
            if (codigo.key == codigoDigitado) { //checa se em alguma posição da chave (key) contém o código digitado!
                auxChecaCodigoDigitado = true  // caso haja o código a variável auxChecaCodigoDigitado = true
                // armazena a posição da chave onde foi encontrado o código digitado.
                auxArmazenaPosicaoChave = codigo.key
                break // interrompe o laço for, pois, o código digitado já foi encontrado
            }
        }
        // caso haja o código digitado, irá excluir da listaCurso a posição armazenada pela var auxArmazenaPosicaoChave
        if (auxChecaCodigoDigitado) {
            println("Curso ${codigoDigitado} : ${listaDeCurso.get(codigoDigitado)} foi excluído!")
            listaDeCurso.remove(auxArmazenaPosicaoChave)
        } else { // caso não haja o código digitado, irá enviar a mensagem para verificar o código digitado!
            println("Curso ${codigoDigitado} não foi excluído! Por Favor verifique o código digitado!")
        }
    }

    // Parte I - Item03: Criar um método na classe DigitalHouseManager que permita registrar um professor adjunto.
    // O método recebe como parâmetros o nome do professor, o sobrenome, o código e a quantidade de horas disponíveis para
    // monitoria. O tempo de casa inicial do professor será zero. O método deve criar um professor adjunto com os
    // dados correspondentes e adicioná-lo à lista de professores.


    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        var tempoDeCasa = 0 // tempo inicial de casa será zero

        // listaAuxProfessoresAdjuntos = [nome, sobrenome, quantidadeDeHoras, tempoDeCasa]
        listaAuxProfessoresAdjuntos = mutableListOf(nome, sobrenome, quantidadeDeHoras, tempoDeCasa)
        // listaDeProfessores = {key = codigoProfessor, value = listaAuxProfessorAdjunto}
        listaDeProfessores.put(codigoProfessor, listaAuxProfessoresAdjuntos) // armazena dados na listaDeProfessores
        println("Lista de Professores: ${listaDeProfessores}")
    }


    // Parte I - Item04. Criar um método na classe DigitalHouseManager que permita registrar um professor titular.
    // O método recebe como parâmetros o nome do professor, o sobrenome, o código e a especialidade.
    // O tempo de casa inicial do professor será zero. O método deve criar um professor titular com os dados
    // correspondentes e adicioná-lo à lista de professores.

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        var tempoDeCasa = 0
        //listaAuxProfessoresTitular = [nome, sobrenome, especialidade, tempoDeCasa]
        listaAuxProfessoresTitular = mutableListOf(nome, sobrenome, especialidade, tempoDeCasa)
        //listaDeProfessores = {key = codigoProfessor, value = listaAuxProfessoresTitular}
        listaDeProfessores.put(codigoProfessor, listaAuxProfessoresTitular) // armazena dados na listaDeProfessores
        println("Lista de Professores: ${listaDeProfessores}")
    }

    // Parte I - Item05. Criar um método na classe DigitalHouseManager que permita excluir um professor.
    // O método recebe como parâmetro o código do professor. O método deve utilizar o código do professor para
    // encontrá-lo na lista de professores e eliminá-lo da lista.


    fun excluirProfessor(codigoProfessor: Int) {
        //variavel aux para verificar se há a lista de curso contém o código digitado
        var auxChecaCodigoProfessor = false
        // variavel auxiliar que armazena a posição da chave, caso haja o códigoProfessor
        var auxArmazenaPosicaoChave = 0

        // utilização de loop for para passar pelos parâmetros de cada chave da lista de Professores:
        for (chave in listaDeProfessores) {
            if (chave.key == codigoProfessor) { // verifica se a posição chave.key == codigoProfessor.
                auxChecaCodigoProfessor = true // caso haja o códigoProfessor a variável auxChecaCodigoProfessor = true
                // armazena-se o valor da chave, para posteriormente excluir essa posição da lista de Professores
                auxArmazenaPosicaoChave = chave.key
                break // interrompe o laço for, pois, o códigoProfessor já foi encontrado.
            }
        }
        //se caso houver o códigoProfessor, os dados referente ao codigoProfessor serão excluídos da ListaDeProfessores.
        if (auxChecaCodigoProfessor) {
            println(
                "Código Professor: ${codigoProfessor}, dados do Professor: ${
                    listaDeProfessores.get(
                        auxArmazenaPosicaoChave
                    )
                } foram excluídos!"
            )
            listaDeProfessores.remove(auxArmazenaPosicaoChave) // exclui dados da listaDeProfessores
            //se caso não houver o códigoProfessor, retorna uma mensagem para verificar código digitado.
        } else {
            println("Código Professor: ${codigoProfessor} não foi excluído! Por Favor verifique o código digitado!")
        }
    }


    // Parte I - Item06. Criar um método na classe DigitalHouseManager que permita registrar um aluno. O método recebe
    // como parâmetros o nome, o sobrenome e o código do aluno. O método deve criar um aluno com os dados
    // correspondentes e adicioná-lo à lista de alunos.

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        // listaAuxAlunos = [nome, sobrenome]
        listaAuxAlunos = mutableListOf(nome, sobrenome)
        // listaAlunos = {key = codigoProfessor, value = listaAuxAlunos}
        listaAlunos.put(codigoAluno, listaAuxAlunos) // armazena dados na listaAlunos
        println("Lista de Alunos: ${listaAlunos}")
    }


    // Parte I - Item07. Criar um método na classe DigitalHouseManager que permita matricular um aluno em um curso.
    // O método recebe como parâmetros o código do aluno e o código do curso em que ele está se matriculando.

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        // Encontrar o aluno que queremos matricular:
        var auxChecaCodigoAluno = false //variavel aux para verificar se há a lista de Alunos contém o código digitado
        var auxPosicaoChaveAluno = 0 // / variavel auxiliar que armazena a posição da chave, caso haja o códigoAluno
        // utilização de loop for para passar pelos parâmetros de cada chave da listaAlunos:
        for (codigo in listaAlunos) {
            if (codigo.key == codigoAluno) {
                auxChecaCodigoAluno = true // caso haja o códigoAluno a variável auxChecaCodigoAluno = true
                // armazena-se o valor da chave, para posteriormente utilizar os valores
                auxPosicaoChaveAluno = codigo.key
                break // interrompe o laço for, pois, o códigoAluno já foi encontrado.
            }
        }
        // caso o códigoAluno for encontrado, imprime na tela as informações do Aluno[nome, sobrenome]
        if (auxChecaCodigoAluno) {
            println("Aluno: ${listaAlunos[auxPosicaoChaveAluno]}")
            // caso o codigoAluno não seja encontrado, imprime a mensagem, para verificar o código!
        } else {
            println("Código do Aluno não encontrado! Por favor verifique o código digitado!")
        }

        //Encontrar o curso em que o aluno está se matriculando:
        var auxChecaCodigoCurso = false //variável aux para verificar se há a lista de curso contém o código digitado
        var auxPosicaoChaveCurso = 0 // variável auxiliar que armazena a posição da chave, caso haja o código digitado
        for (codigo in listaDeCurso) {
            if (codigo.key == codigoCurso) { // checa se o valor da posição chave é igual ao codigoCurso
                auxChecaCodigoCurso = true // caso haja o códigoCurso a variável auxChecaCodigoCurso = true
                auxPosicaoChaveCurso = codigo.key // armazena o valor da posição key
                break // interrompe o laço for, pois, o códigoAluno já foi encontrado.
            }
        }
        // caso seja encontrado o códigoCurso, irá imprimir as informações do curso:
        if (auxChecaCodigoCurso) {
            println("Curso: ${listaDeCurso[auxPosicaoChaveCurso]}")

            // caso não seja encontrado o código do curso, irá imprimir as informações para verificar código digitado!
        } else {
            println("Código do Curso não encontrado! Por favor verifique o código digitado!")
        }

        // Matricular o aluno, se for possível.
        // Para matricular o aluno, devemos verificar se o código do Aluno, e Código Curso estão corretos e verificar se
        // o curso desejado tem vagas disponíveis(quantidade máxima de Alunos), para posteriormente realizar a inclusão
        // da Matrícula.


        // Implementando os "try e catch" para se caso houver alguma exceção, não venha parar o programa:

        // armazenando a informação da quantidade Máxima de Alunos em uma lista auxiliar!
        var auxLista = listaDeCurso[auxPosicaoChaveCurso]
        try {
            // Para acessar a variável quantidade máxima Alunos iremos converter as informações do curso em lista:
            // auxLista = [nomeCurso, quantidadeMaximaAlunos], convertendo auxLista para o tipo List
            auxLista = auxLista?.toList()
        } catch (exceptionGeneric: Exception) { // exception genérica
        }

        // Implementando o "try e catch" se caso houver uma exceção para converter a variável quantidadeMaximaAlunos para
        // o tipo Int, a qual esta contida na auxLista = [nomeCurso, quantidadeMaximaAlunos]

        // A var auxQuantidadeMaximaAlunos será utilizada para verificar se há vagas para a realizar a matrícula nos cursos
        var auxQuantidadeMaximaAlunos: Int = 0 // var aux para a conversão de quantidadeMaximaAlunos no tipo Int:
        try {
            auxQuantidadeMaximaAlunos = auxLista?.get(1) as Int //convertendo var auxQuantidadeMaximaAlunos ao tipo Int
        } catch (exceptionGeneric: Exception) { // exception genérica
        }


        // Implementando o "try e catch" para armazenar a variável nomeDoCurso para o tipo Any, a qual esta contida na
        // auxLista = [nomeCurso, quantidadeMaximaAlunos]
        var auxNomeDoCurso: Any = ""  // var aux para a conversão do nome do curso para o tipo: Any
        try {
            auxNomeDoCurso = auxLista?.get(0) as Any // armazenando o nome do curso
        } catch (exceptionGeneric: Exception) { // exception genérica
        }


        // Verifica se há vagas disponíveis do curso requerido, se o códigoAluno e códigoCurso estão corretos para poder
        // realizar a matrícula do Aluno no Curso.
        if (auxQuantidadeMaximaAlunos > 0 && auxChecaCodigoAluno && auxChecaCodigoCurso) {
            // havendo vagas e os códigos corretos, iremos executar a Matrícula.
            println("Vagas Disponíveis: ${auxQuantidadeMaximaAlunos}")
            println("Matrícula efetuada!")

            // havendo vagas e os códigos corretos, iremos atualizar na ListaDeCurso a quantidadeMaximaAlunos
            listaDeCurso.remove(auxPosicaoChaveCurso) // remove da listaDeCurso a informação antiga do respectivo curso


            // atualiza a lista de curso com as informações de quantidadeMaximaAlunos = (auxQuantidadeMaximaAlunos -1)
            // listaAuxCurso = [auxNomeDoCurso, (auxQuantidadeMaximaAlunos - 1)]
            listaAuxCurso = mutableListOf(auxNomeDoCurso, (auxQuantidadeMaximaAlunos - 1)) // atualiza listaAuxCurso
            //listaDeCurso = {key = codigoCurso, chave = listaAuxCurso}
            listaDeCurso.put(codigoCurso, listaAuxCurso) // armazena as novas informações na Lista de Cursos

            println("Lista de Cursos: ${listaDeCurso}\n") // imprime na tela as informações atualizadas

            // Adicionando os dados do Curso escolhido e os dados do aluno para a Lista de Matrícula:
            try {
                // listaMatriculas = {key = [nome do Curso, quantidadeVagas], value = [nome, sobrenome]}
                listaMatriculas.put(listaDeCurso[auxPosicaoChaveCurso]!!, listaAlunos[auxPosicaoChaveAluno]!!)
            } catch (exceptionGeneric: Exception) {  // exception genérica
            }
            // caso não haja vagas no curso, imprime a mensagem abaixo:
        } else if (auxQuantidadeMaximaAlunos <= 0 && auxChecaCodigoCurso) {
            println("Não há vagas disponíveis para o curso solicitado!\n")
            // caso o código do curso e código aluno estejam incorretos, imprime a mensagem:
        } else {
            println("Matrícula não pode ser efetuada, por favor verifique os dados!\n")
        }
    }

    //8. Criar um método na classe DigitalHouseManager que permita alocar professores a um curso. O método recebe como
    // parâmetros o código do curso, o código do professor titular e o código do professor adjunto. O método deve:
    // Encontrar o professor titular na lista de professores.
    // Encontrar o professor adjunto na lista de professores.
    // Alocar ambos professores ao curso.

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        //variavel aux para verificar se há a lista de curso contém o código digitado
        var auxChecaCodigoDigitado = false
        // variavel auxiliar que armazena a posição da chave, caso haja o código digitado
        var auxArmazenaPosicaoChave = 0

        // utilização de loop for para passar pelos itens da lista de cursos:
        for (codigo in listaDeCurso) {
            if (codigo.key == codigoCurso) { //checa se em alguma posição da chave (key) contém o código digitado!
                auxChecaCodigoDigitado = true  // caso haja o código a variável auxChecaCodigoDigitado = true
                // armazena a posição da chave onde foi encontrado o código digitado.
                auxArmazenaPosicaoChave = codigo.key
                break // interrompe o laço for, pois, o código digitado já foi encontrado
            }
        }
        // caso haja o código digitado, irá excluir da listaCurso a posição armazenada pela var auxArmazenaPosicaoChave
        if (auxChecaCodigoDigitado) {
            println("Código do Curso: ${codigoCurso}  ${listaDeCurso[auxArmazenaPosicaoChave]}")
        } else { // caso não haja o código digitado, irá enviar a mensagem para verificar o código digitado!
            println("Curso ${codigoCurso} não encontrado! Por Favor verifique o código digitado!")
        }


        //Encontrar o Professor Titular na Lista de Professores:

        //variável aux para verificar se há a lista de Professores contém o código do Professor Titular
        var auxChecaCodigoProfTitular = false
        // variável auxiliar que armazena a posição da chave, caso haja o código do Professor Titular
        var auxPosicaoChaveProfTitular = 0

        for (codigo in listaDeProfessores) {
            if (codigo.key == codigoProfessorTitular) { // checa se o valor da posição .key é igual ao codigoProfessorTitular
                // caso haja o códigoProfessorTitular a variável auxChecaCodigoProfTitular = true
                auxChecaCodigoProfTitular = true
                auxPosicaoChaveProfTitular = codigo.key // armazena o valor da posição key
                break // interrompe o laço for, pois, o códigoProfTitular já foi encontrado.
            }
        }

        // caso seja encontrado o códigoProfTitular, irá imprimir as informações do Professor Titular:
        if (auxChecaCodigoProfTitular) {
            println("Código Professor Titular: ${listaDeProfessores[auxPosicaoChaveProfTitular]}")

            // caso não seja encontrado o código do Professor Titular, irá imprimir as informações para verificar código digitado!
        } else {
            println("Código do Professor Titular não encontrado! Por favor verifique o código digitado!")
        }

        //Encontrar o Professor Adjunto na Lista de Professores
        //variável aux para verificar se há a lista de Professores contém o código do Professor Adjunto
        var auxChecaCodigoProfAdjunto = false
        // variável auxiliar que armazena a posição da chave, caso haja o código do Professor Adjunto
        var auxPosicaoChaveProfAdjunto = 0

        for (codigo in listaDeProfessores) {
            if (codigo.key == codigoProfessorAdjunto) { // checa se o valor da posição .key é igual ao codigoProfessorAdjunto
                // caso haja o códigoProfessorAdjunto a variável auxChecaCodigoProfAdjunto = true
                auxChecaCodigoProfAdjunto = true
                auxPosicaoChaveProfAdjunto = codigo.key // armazena o valor da posição key
                break // interrompe o laço for, pois, o códigoProfAdjunto já foi encontrado.
            }
        }
        // caso seja encontrado o códigoProfTitular, irá imprimir as informações do Professor Adjunto:
        if (auxChecaCodigoProfAdjunto) {
            println("Código Professor Titular: ${listaDeProfessores[auxPosicaoChaveProfAdjunto]}")
            // caso não seja encontrado o código do Professor Adjunto, irá imprimir as informações para verificar código digitado!
        } else {
            println("Código do Professor Adjunto não encontrado! Por favor verifique o código digitado!")
        }

        // se todos os parâmetros abaixos foram válidos, irá alocar os Professores Titular e Adjunto na Lista de Cursos:
        if (auxChecaCodigoDigitado && auxChecaCodigoProfTitular && auxChecaCodigoProfAdjunto) {

            // variáveis auxiliares para converter os valores das Listas para o tipo String:
            // listaAlocaProf contém as informações antigas [nomedoCurso, quantidadeMaximaAlunos]
            var listaAlocaProf = listaDeCurso[auxArmazenaPosicaoChave].toString()
            // informações Prof Titular = [nome, sobrenome, codigoProfessor, especialidade, tempoDeCasa]
            var auxProfTitular = listaDeProfessores[auxPosicaoChaveProfTitular].toString()
            // informações Prof Adjunto = [nome, sobrenome, codigoProfessor, qteHorasMonitoria, tempoDeCasa]
            var auxProfAdjunto = listaDeProfessores[auxPosicaoChaveProfAdjunto].toString()

            // para alocar os dados dos Professores Titular e Professores Adjuntos, iremos remover a informação antiga
            // referente ao código do curso.
            listaDeCurso.remove(auxArmazenaPosicaoChave) // remove da listaDeCurso a informação antiga do respectivo curso
            // atualiza a listaAuxCurso com as informações das listas Auxiliares:
            listaAuxCurso = mutableListOf(listaAlocaProf, auxProfTitular, auxProfAdjunto)
            // armazena as novas informações na Lista de Cursos, com os dados dos Professores Titular e Adjunto:
            listaDeCurso.put(codigoCurso, listaAuxCurso)
            println("Professores alocados na lista de Curso: ${listaDeCurso}")

            //caso os parâmetros forem inválidos, imprime a mensagem abaixo:
        } else {
            println("Professores não foram alocados na lista de Curso! Por favor verifique os dados cadastrados!")
        }

    }

}

