package Classes

class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var especialidade: String) :
    Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    //sobrescrevendo as funções equals(), toString() e hashCode():
    override fun equals(other: Any?): Boolean {
        return (other is ProfessorTitular && other.codigoProfessor == this.codigoProfessor)
    }

    override fun toString(): String {
        return "O Professor(a) Titular: ${nome} ${sobrenome} possui Tempo de Casa: ${tempoDeCasa} dias, Código de Professor: ${codigoProfessor} e Especialidade: ${especialidade}"
    }

    override fun hashCode(): Int {
        return this.codigoProfessor
    }
}