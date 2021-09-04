package Classes

// 1. Criar um diagrama de classes que modele a classe DigitalHouseManager.
// A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de professores,
// uma lista de cursos e uma lista de matrículas

class DigitalHouseManger(
    var listaAlunos: MutableList<Alunos>,
    var listaProfessorTitular: MutableList<ProfessorTitular>,
    var listaProfessorAdjunto: MutableList<ProfessorAdjunto>,
    var listaCurso: MutableList<Curso>,
    var listaMatriculas: MutableList<Matricula>
) {

    //sobreescrevendo a Função toString() para exibir informações da Composição da DigitalHouseManager:
    override fun toString(): String {
        return "Digital House Manager composta por: " +
                "\nLista de Alunos: ${listaAlunos}" +
                "\nLista de Cursos: ${listaCurso}" +
                "\nLista de Professores Titulares: ${listaProfessorTitular}" +
                "\nLista de Professores Adjuntos: ${listaProfessorAdjunto}" +
                "\nLista de Alunos Matrículados: ${listaMatriculas}"
    }





}