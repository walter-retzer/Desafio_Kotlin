package Classes

open class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var horasDeMonitoria: Int) :
    Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    //sobrescrevendo as funções equals(), toString() e hashCode():
    override fun equals(other: Any?): Boolean {
        return (other is ProfessorAdjunto && other.codigoProfessor == this.codigoProfessor)
    }

    override fun toString(): String {
        return "O Professor(a) Adjunto: ${nome} ${sobrenome} possui Tempo de Casa: ${tempoDeCasa} dias, Código de Professor: ${codigoProfessor} e horas de Monitoria: ${horasDeMonitoria}h"
    }

    override fun hashCode(): Int {
        return this.codigoProfessor
    }
}