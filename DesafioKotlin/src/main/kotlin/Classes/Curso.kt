package Classes

//Além de ter um nome e código de curso, um curso possui um professor titular
//(ProfessorTitular), um professor adjunto (ProfessorAdjunto), uma quantidade
//máxima de alunos (Integer) e uma lista de alunos matriculados.

class Curso(
    var nomeDoCurso: String,
    var codigoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    var listaAlunos: MutableList<Alunos>

) {

    //sobrescrevendo as funções equals(), toString() e hashCode():

    //sobreescrvendo a Função equals() para caso o códigoCurso for igual, retorne true:
    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigoCurso == this.codigoCurso)
    }

    //sobreescrevendo a Função toString() para exibir informações do Curso:
    override fun toString(): String {
        return "O curso ${nomeDoCurso} possui o Código de curso: ${codigoCurso}, Professor Titular: ${professorTitular.nome}, Professor Adjunto: ${professorAdjunto.nome} e quantidade máxima de Alunos: ${quantidadeMaximaAlunos}"
    }

    //sobreescrevendo a função hashCode() para exibir o "ID" do hashCode igual ao valor da variável codigoCurso:
    override fun hashCode(): Int {
        return this.codigoCurso
    }

}