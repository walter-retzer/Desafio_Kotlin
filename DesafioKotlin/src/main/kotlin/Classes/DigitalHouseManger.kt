package Classes


class DigitalHouseManger() {

// Parte G - Item01: Criar um diagrama de classes que modele a classe DigitalHouseManager.
// A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de professores,
// uma lista de cursos e uma lista de matrículas

    // usado o Map para armazenar o nome do curso na posição chave e código e quantidade máxima de alunos na posição valores como lista
    // listaDeCursos = {key = codigoDoCurso, value: nomeDoCurso, quantidadeMaximaAlunos}
    var listaDeCurso = mutableMapOf<Int, List<Any>>()

    // lista aux para armazenar código do curso e quantidade maxima de alunos como lista.
    var listaAuxCurso = mutableListOf<Any>() // listaAuxCurso = [nomeDoCurso, quantidadeMaximaAlunos]

    // listaDeProfessores = {key = nomeDoProfessor, value: listaAuxProfessor[]}
    var listaDeProfessores = mutableMapOf<Int, List<Any>>()

    //listaAuxProfessoresAdjuntos = [nome do professor, o sobrenome, quantidade de horas disponíveis para monitoria, tempoDeCasa]
    var listaAuxProfessoresAdjuntos = mutableListOf<Any>()

    //listaAuxProfessores = [nome do professor, o sobrenome, o código e a especialidade, tempoDeCasa]
    var listaAuxProfessoresTitular = mutableListOf<Any>()

    //listaAlunos = {key = codigoDoAluno, value = listaAuxAlunos[]}
    var listaAlunos = mutableMapOf<Int, List<String>>()

    //ListaAuxAlunos = [nome, sobrenome]
    var listaAuxAlunos = mutableListOf<String>()

    var listaMatriculas = mutableMapOf<List<String>, List<Int>>()


    // Parte I - Item01: Criar um método na classe DigitalHouseManager que permita registrar um
    // curso. O método recebe como parâmetros o nome do curso, o código e a
    // quantidade máxima de alunos admitidos. O método deve criar um curso com
    // os dados correspondentes e adicioná-lo à lista de cursos.

    var contadorCursos: Int = 0  // variável para contar quantos cursos foram registrados.

    // função registrarCurso:
    fun registrarCurso(nomeDoCurso: String, codigoDoCurso: Int, quantidadeMaximaAlunos: Int) {

        // a listaAuxCurso recebe os parametros "Int": código do curso e quantidade Máxima de Alunos
        // listaAuxCurso[codigoDoCurso, quantidadeMaximaAlunos]
        listaAuxCurso = mutableListOf(nomeDoCurso, quantidadeMaximaAlunos)
        // insere os dados na lista de curso:
        listaDeCurso.put(codigoDoCurso, listaAuxCurso) // {key = nomeDoCurso, value: listaAuxCurso}
        println(listaDeCurso)
        contadorCursos++ //acresce 1 ao contadorCurso

    }

    // Parte I - Item02: Criar um método na classe DigitalHouseManager que permita excluir um curso.
    // O método recebe como parâmetro o código do curso. O método deve utilizar o código do curso para encontrá-lo
    // na lista de cursos e excluí-lo da lista.

    fun excluirCurso(codigoDigitado: Int) {
        //variavel aux para verificar se há a lista de curso contém o código digitado
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

    var contadorProfessores = 0

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int) {
        var tempoDeCasa = 0 // tempo inicial será zero
        // listaAuxProfessoresAdjuntos = [nome, sobrenome, quantidadeDeHoras, tempoDeCasa]
        listaAuxProfessoresAdjuntos = mutableListOf(nome, sobrenome, quantidadeDeHoras, tempoDeCasa)
        // listaDeProfessores = {key = codigoProfessor, value = listaAuxProfessorAdjunto}
        listaDeProfessores.put(codigoProfessor, listaAuxProfessoresAdjuntos) // armazena dados na listaDeProfessores
        println(listaDeProfessores)
        contadorProfessores++ //acresce 1 ao contadorProfessores
    }

    // Parte I - Item04. Criar um método na classe DigitalHouseManager que permita registrar um
    // professor titular. O método recebe como parâmetros o nome do professor, o sobrenome, o código e a especialidade.
    // O tempo de casa inicial do professor será zero. O método deve criar um professor titular com os dados
    // correspondentes e adicioná-lo à lista de professores.

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String) {
        var tempoDeCasa = 0
        //listaAuxProfessoresTitular = [nome, sobrenome, especialidade, tempoDeCasa]
        listaAuxProfessoresTitular = mutableListOf(nome, sobrenome, especialidade, tempoDeCasa)
        //listaDeProfessores = {key = codigoProfessor, value = listaAuxProfessoresTitular}
        listaDeProfessores.put(codigoProfessor, listaAuxProfessoresTitular) // armazena dados na listaDeProfessores
        println(listaDeProfessores)
        contadorProfessores++ //acresce 1 ao contadorProfessores
    }

//    // Parte I - Item05. Criar um método na classe DigitalHouseManager que permita excluir um professor.
//    // O método recebe como parâmetro o código do professor. O método deve utilizar o código do professor para
//    // encontrá-lo na lista de professores e eliminá-lo da lista.


    fun excluirProfessor(codigoProfessor: Int) {
        //variavel aux para verificar se há a lista de curso contém o código digitado
        var auxChecaCodigoProfessor = false
        // variavel auxiliar que armazena a posição da chave, caso haja o códigoProfessor
        var auxArmazenaPosicaoChave = 0

        // utilização de loop for para passar pelos parâmetros de cada chave da lista de Professores:
        for (chave in listaDeProfessores) {
            if (chave.key == codigoProfessor) { // verifica se a posição chave.key == codigoProfessor.
                auxChecaCodigoProfessor = true  // caso haja o códigoProfessor a variável auxChecaCodigoProfessor = true
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
            listaDeProfessores.remove(auxArmazenaPosicaoChave)
            //se caso não houver o códigoProfessor, retorna uma mensagem para verificar código digitado.
        } else {
            println("Código Professor: ${codigoProfessor} não foi excluído! Por Favor verifique o código digitado!")
        }
    }

    // Parte I - Item06. Criar um método na classe DigitalHouseManager que permita registrar um aluno. O método recebe
    // como parâmetros o nome, o sobrenome e o código do aluno. O método deve criar um aluno com os dados
    // correspondentes e adicioná-lo à lista de alunos.

    var contadorAlunos = 0

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        // listaAuxAlunos = [nome, sobrenome]
        listaAuxAlunos = mutableListOf(nome, sobrenome)
        // listaAlunos = {key = codigoProfessor, value = listaAuxAlunos}
        listaAlunos.put(codigoAluno, listaAuxAlunos) // armazena dados na listaAlunos
        println(listaAlunos)
        contadorAlunos++ // acresce 1 ao contadorAlunos
    }


    // Parte I - Item07. Criar um método na classe DigitalHouseManager que permita matricular um aluno em um curso.
    // O método recebe como parâmetros o código do aluno e o código do curso em que ele está se matriculando.

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        // Encontrar o aluno que queremos matricular:
        var auxChecaCodigoAluno = false //variavel aux para verificar se há a lista de Alunos contém o código digitado
        var auxPosicaoChaveAluno = 0 // / variavel auxiliar que armazena a posição da chave, caso haja o códigoAluno

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
            print(listaAlunos[auxPosicaoChaveAluno])
            // caso o codigoAluno não seja encontrado, imprime a mensagem, para verificar o código!
        } else {
            println("Código do Aluno não encontrado! Por favor verifique o código digitado!")
        }

        //Encontrar o curso em que o aluno está se matriculando:
        var auxChecaCodigoCurso = false //variável aux para verificar se há a lista de curso contém o código digitado
        var auxPosicaoChaveCurso = 0 // variável auxiliar que armazena a posição da chave, caso haja o código digitado
        for (codigo in listaDeCurso) {
            if (codigo.key == codigoCurso) { // checa se o valor da posição .key é igual ao codigoCurso
                auxChecaCodigoCurso = true // caso haja o códigoCurso a variável auxChecaCodigoCurso = true
                auxPosicaoChaveCurso = codigo.key // armazena o valor da posição key
                break // interrompe o laço for, pois, o códigoAluno já foi encontrado.
            }
        }
        // caso seja encontrado o códigoCurso, irá imprimir as informações do curso:
        if (auxChecaCodigoCurso) {
            print(listaDeCurso[auxPosicaoChaveCurso])

            // caso não seja encontrado o código do curso, irá imprimir as informações para verificar código digitado!
        } else {
            println("Código do Curso não encontrado! Por favor verifique o código digitado!")
        }

        // Matricular o aluno, se for possível.

        // Para matricular o aluno, devemos verificar se o código do Aluno, e Código Curso estão corretos e verificar se
        // o curso desejado tem vagas disponíveis(quantidade máxima de Alunos), para posteriormente realizar a inclusão
        // da Matrícula.

        // Para acessar a variável quantidade máxima Alunos iremos converter as informações do curso em lista:
        var auxLista = listaDeCurso[auxPosicaoChaveCurso]!!.toList() // codigoCurso = [nomeCurso, qteMaxAlunos]
        var auxQuantidadeMaximaAlunos = auxLista.get(1).toString() // convertendo qteMaxAlunos para String
        var auxQteMaxAlunos = auxQuantidadeMaximaAlunos.toInt() // convertendo qteMaxAlunos para Int

        var nomeDoCurso = auxLista.get(0).toString() // armazenando o nome do curso

        // Verifica se há vagas disponíveis do curso requerido, se o códigoAluno e códigoCurso estão corretos para poder
        // realizar a matrícula do Aluno no Curso.
        if (auxQteMaxAlunos > 0 && auxChecaCodigoAluno && auxChecaCodigoCurso) {
            println(" Matrícula efetuada!")
            println("")
            // havendo vagas, iremos atualizar na ListaDeCurso a quantidadeMaximaAlunos
            listaDeCurso.remove(auxPosicaoChaveCurso) // remove a informação antiga do respectivo curso
            // atualiza a lista de curso com as informações de auxQteMaxAlunos - 1:
            listaAuxCurso = mutableListOf(nomeDoCurso, (auxQteMaxAlunos - 1))
            listaDeCurso.put(codigoCurso, listaAuxCurso) // armazena as novas informações na Lista de Cursos

//            listaDeCurso.replace(codigoCurso, auxLista)
//            listaMatriculas.put(listaAlunos[auxPosicaoChaveAluno]!!, listaDeCurso[auxPosicaoChaveCurso]!!)
//            println(listaMatriculas)

        // caso não haja vagas, imprime a mensagem na tela!
        } else if (auxQteMaxAlunos >= 0){
            println(" Não há vagas disponíveis para o curso solicitado!")
            println("")
        // caso o código do curso e código aluno estajam incorretos, imprime a mensagem:
        } else {
            println("Matrícula não pode ser efetuada, por favor verifique os dados!")
            println("")
        }
    }
}

