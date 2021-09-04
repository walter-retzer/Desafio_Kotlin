package Classes

class Alunos(var nome: String, var sobrenome: String, var codigoAluno: Int) {

    //sobrescrevendo as funções equals(), toString() e hashCode():
    override fun equals(other: Any?): Boolean {
        return (other is Alunos && other.codigoAluno == this.codigoAluno)
    }

    override fun toString(): String {
        return "Sr(a). ${nome} ${sobrenome} possui o Código de Aluno: ${codigoAluno}"
    }

    override fun hashCode(): Int {
        return this.codigoAluno
    }
}