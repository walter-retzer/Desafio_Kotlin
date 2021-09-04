package Classes

class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoProfessor: Int) {

    //sobrescrevendo as funções equals(), toString() e hashCode():
    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codigoProfessor == this.codigoProfessor)
    }

    override fun toString(): String {
        return "O Professor(a) ${nome} ${sobrenome} possui Tempo de Casa: ${tempoDeCasa} dias e o código de professor: ${codigoProfessor}"
    }

    override fun hashCode(): Int {
        return this.codigoProfessor
    }

}