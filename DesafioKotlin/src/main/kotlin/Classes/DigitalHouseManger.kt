package Classes


class DigitalHouseManger() {

// Parte G - Item01: Criar um diagrama de classes que modele a classe DigitalHouseManager.
// A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de professores,
// uma lista de cursos e uma lista de matrículas

    // usado o Map para armazenar o nome do curso na posição chave e código e quantidade máxima de alunos na posição valores como lista
    // listaDeCursos = {key = nomeDoCurso, value: codigoDoCurso, quantidadeMaximaAlunos}
    var listaDeCurso = mutableMapOf<String, List<Int>>()

    // lista aux para armazenar código do curso e quantidade maxima de alunos como lista.
    var listaAuxCurso = mutableListOf<Int>() // listaAuxCurso = [codigoDoCurso, quantidadeMaximaAlunos]

    // listaDeProfessores = {key = nomeDoProfessor, value: listaAuxProfessor[]}
    var listaDeProfessores = mutableMapOf<Int, List<Any>>()

    //listaAuxProfessoresAdjuntos = [nome do professor, o sobrenome, quantidade de horas disponíveis para monitoria, tempoDeCasa]
    var listaAuxProfessoresAdjuntos = mutableListOf<Any>()

    //listaAuxProfessores = [nome do professor, o sobrenome, o código e a especialidade, tempoDeCasa]
    var listaAuxProfessoresTitular = mutableListOf<Any>()

    var listaAlunos = mutableMapOf<Int, List<Any>>()
    var listaMatriculas = mutableMapOf<Int, List<Any>>()


    // Parte I - Item01: Criar um método na classe DigitalHouseManager que permita registrar um
    // curso. O método recebe como parâmetros o nome do curso, o código e a
    // quantidade máxima de alunos admitidos. O método deve criar um curso com
    // os dados correspondentes e adicioná-lo à lista de cursos.

    var contadorCursos: Int = 0  // variável para contar quantos cursos foram registrados.

    // função registrarCurso:
    fun registrarCurso(nomeDoCurso: String, codigoDoCurso: Int, quantidadeMaximaAlunos: Int) {

        // a listaAuxCurso recebe os parametros "Int": código do curso e quantidade Máxima de Alunos
        // listaAuxCurso[codigoDoCurso, quantidadeMaximaAlunos]
        listaAuxCurso = mutableListOf(codigoDoCurso, quantidadeMaximaAlunos)
        // insere os dados na lista de curso:
        listaDeCurso.put(nomeDoCurso, listaAuxCurso) // {key = nomeDoCurso, value: listaAuxCurso}
        println(listaDeCurso)
        contadorCursos++ //acresce 1 ao contadorCurso

    }

    // Parte I - Item02: Criar um método na classe DigitalHouseManager que permita excluir um curso.
    // O método recebe como parâmetro o código do curso. O método deve utilizar o código do curso para encontrá-lo
    // na lista de cursos e excluí-lo da lista.

    fun excluirCurso(codigoDigitado: Int) {
        var auxChecaCodigoDigitado = false //variavel aux para verificar se há a lista de curso contém o código digitado
        var aux = " " // variavel auxiliar que armazena a posição da chave, caso haja o código digitado

        // utilização de 2 loops for para passar pelos parâmetros de chave e valor de cada item da lista de cursos:
        for (chave in listaDeCurso) {
            for (valor in chave.value) {
                if (chave.value.contains(codigoDigitado)) { //checa se na posição valor contém o código digitado!
                    auxChecaCodigoDigitado = true  // caso haja o código a variável auxChecaCodigoDigitado = true
                    aux = chave.key // armazena-se o valor da chave, para posteriormente excluir essa posição da lista
                    break // interrompe o laço for, pois, o código digitado já foi encontrado
                }
            }
        }

        // caso haja o código digitado, irá excluir da lista de curso a posição armazenada pela variável aux
        if (auxChecaCodigoDigitado) {
            listaDeCurso.remove(aux)
            println("Curso ${codigoDigitado} foi excluído!")
            // caso não haja o código digitado, irá enviar a mensagem para verificar o código digitado!
        } else {
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

    // Parte I - Item05. Criar um método na classe DigitalHouseManager que permita excluir um professor.
    // O método recebe como parâmetro o código do professor. O método deve utilizar o código do professor para
    // encontrá-lo na lista de professores e eliminá-lo da lista.


    fun excluirProfessor(codigoProfessor: Int) {
        var auxChecaCodigoProfessor = false //variavel aux para verificar se há a lista de curso contém o código digitado
        var aux = 0 // variavel auxiliar que armazena a posição da chave, caso haja o códigoProfessor

        // utilização de loop for para passar pelos parâmetros de cada chave da lista de Professores:
        for (chave in listaDeProfessores) {
            if (chave.key == codigoProfessor) { // verifica se a posição chave.key == codigoProfessor.
                auxChecaCodigoProfessor = true  // caso haja o códigoProfessor a variável auxChecaCodigoProfessor = true
                aux = chave.key // armazena-se o valor da chave, para posteriormente excluir essa posição da lista de Professores
                break // interrompe o laço for, pois, o códigoProfessor já foi encontrado.
            }
        }
        //se caso houver o códigoProfessor, os dados referente ao codigoProfessor serão excluídos da Lista de Professores.
        if (auxChecaCodigoProfessor) {
            println("Código Professor: ${codigoProfessor} foi excluído!")
            listaDeProfessores.remove(aux)
            //se caso não houver o códigoProfessor, retorna uma mensagem para verificar código digitado.
        } else {
            println("Código Professor: ${codigoProfessor} não foi excluído! Por Favor verifique o código digitado!")
        }
    }
}

