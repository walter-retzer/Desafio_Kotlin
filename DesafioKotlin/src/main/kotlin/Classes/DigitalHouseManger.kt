package Classes

// 1. Criar um diagrama de classes que modele a classe DigitalHouseManager.
// A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de professores,
// uma lista de cursos e uma lista de matrículas

class DigitalHouseManger(
    var listaAlunos: MutableList<Alunos>,
    var listaProfessorTitular: MutableList<ProfessorTitular>,
    var listaProfessorAdjunto: MutableList<ProfessorAdjunto>,
    var listaMatriculas: MutableList<Matricula>
) {
    var contador: Int = 1
    var nomeDoCurso: String = ""
    var codigoDoCurso: Int = 0
    var quantidadeMaximaAlunos: Int = 0

    var listaAux = mutableListOf(nomeDoCurso, codigoDoCurso, quantidadeMaximaAlunos)

    //var listaDeCurso = mutableMapOf(contador to listaAux)
    var listaDeCurso = mutableMapOf<Int, List<Any>>()


    //sobreescrevendo a Função toString() para exibir informações da Composição da DigitalHouseManager:
    override fun toString(): String {
        return "Digital House Manager composta por: " +
                "\nLista de Alunos: ${listaAlunos}" +
                "\nLista de Cursos: ${listaDeCurso}" +
                "\nLista de Professores Titulares: ${listaProfessorTitular}" +
                "\nLista de Professores Adjuntos: ${listaProfessorAdjunto}" +
                "\nLista de Alunos Matrículados: ${listaMatriculas}"
    }

    // 1. Criar um método na classe DigitalHouseManager que permita registrar um curso.
    // O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    // O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos.

    fun registrarCurso(nomeDoCurso: String, codigoDoCurso: Int, quantidadeMaximaAlunos: Int) {

        listaAux = mutableListOf(nomeDoCurso, codigoDoCurso, quantidadeMaximaAlunos)
        listaDeCurso[contador] = listaAux
        println(listaDeCurso)
        contador++


    }

    //2. Criar um método na classe DigitalHouseManager que permita excluir um curso.
    // O método recebe como parâmetro o código do curso. O método deve utilizar o código do curso para encontrá-lo
    // na lista de cursos e excluí-lo da lista.

    fun excluirCurso(codigoDigitado: Int) {
        var aux1 = false
        var aux = 0

        for (chave in listaDeCurso) {
            for (valor in chave.value) {
                if (chave.value.contains(codigoDigitado)) {
                    aux1 = true
                    aux = chave.key
                    break
                }
            }
        }
        if (aux1) {
            listaDeCurso.remove(aux)
            println("Curso ${codigoDigitado} foi excluído!")
        } else {
            println("Curso ${codigoDigitado} não foi excluído! Por Favor verifique o código digitado!")
        }

        //println("Curso ${codigoDigitado} excluído!")


    }


    fun devolverPecas(numero: Int) {
//
//        if (numero <= dicionario.size && numero > 0) {
//            dicionario.remove(numero) // remove(key) - remove o valor da chave
//            contador = 0 // reseta contador para que poder novamente ser incluido um item no endereço removido
//            println("")
//            println(yellow + "-------------------------------------------Devolução de Itens----------------------------------------------------------------------------------------------" + reset)
//            println("Devolução dos Itens do Armario: ${numero}")
//            println(yellow + "-----------------------------------------------------------------------------------------------------------------------------------------------------------" + reset)
//            println("")

    }


}