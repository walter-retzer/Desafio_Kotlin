package Classes

import java.util.*

// Criar um diagrama de classes que modele a classe Matrícula.
// A princípio, uma matrícula tem um aluno (Aluno), um curso (Curso) e uma data de matrícula (Date).

class Matricula(var aluno: Alunos, var curso: Curso) {

    //criado a variável DataMatrícula
    val dataMatricula: String
    //Implementado o init para que (gere) inicialize a variável dataMatrícula com a respectiva data atual:
    init {
        val data = Calendar.getInstance()
        dataMatricula = "Data: ${data.get(Calendar.DATE)}/${(data.get(Calendar.MONTH) + 1)}/${data.get(Calendar.YEAR)}"
    }

    //Sobreescrevendo a função toString() para exibir informações da Matrícula efetuada no dia atual:
    override fun toString(): String {
        return "O Aluno: ${aluno.nome} ${aluno.sobrenome} foi matrículado no curso ${curso.nomeDoCurso} na ${dataMatricula}"
    }

}