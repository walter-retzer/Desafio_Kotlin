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

    var listaAlunos = mutableMapOf<Int, List<Any>>()
    var listaDeProfessores = mutableMapOf<Int, List<Any>>()
    var listaMatriculas = mutableMapOf<Int, List<Any>>()


    //Parte I - Item01: Criar um método na classe DigitalHouseManager que permita registrar um
    //curso. O método recebe como parâmetros o nome do curso, o código e a
    //quantidade máxima de alunos admitidos. O método deve criar um curso com
    //os dados correspondentes e adicioná-lo à lista de cursos.

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
                    break // interrompe o laço for, pois o código digitado já foi encontrado
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

}

