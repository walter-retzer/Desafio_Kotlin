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
    var contador=0

    //sobreescrevendo a Função toString() para exibir informações da Composição da DigitalHouseManager:
    override fun toString(): String {
        return "Digital House Manager composta por: " +
                "\nLista de Alunos: ${listaAlunos}" +
                //"\nLista de Cursos: ${listaCurso}" +
                "\nLista de Professores Titulares: ${listaProfessorTitular}" +
                "\nLista de Professores Adjuntos: ${listaProfessorAdjunto}" +
                "\nLista de Alunos Matrículados: ${listaMatriculas}"
    }

    // 1. Criar um método na classe DigitalHouseManager que permita registrar um curso.
    // O método recebe como parâmetros o nome do curso, o código e a quantidade máxima de alunos admitidos.
    // O método deve criar um curso com os dados correspondentes e adicioná-lo à lista de cursos.

    fun registrarCurso(nomeDoCurso: String, codigoDoCurso: Int, quantidadeMaximaAlunos: Int){

        var listaAux = mutableListOf(nomeDoCurso, codigoDoCurso, quantidadeMaximaAlunos)
        var listaDeCurso = mutableMapOf(contador to listaAux)
        println(listaDeCurso)
        contador++

    }



}