package Classes

//A classe ProfessorAdjunto herdará da Classe Abstrata Professor:
class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var horasDeMonitoria: Int) :
    Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    //sobrescrevendo as funções equals(), toString() e hashCode():

    //sobreescrvendo a Função equals() para caso o códigoProfessor for igual, retorne true:
    override fun equals(other: Any?): Boolean {
        return (other is ProfessorAdjunto && other.codigoProfessor == this.codigoProfessor)
    }

    //sobreescrevendo a Função toString() para exibir informações do Professor Adjunto:
    override fun toString(): String {
        return "O Professor(a) Adjunto: ${nome} ${sobrenome} possui Tempo de Casa: ${tempoDeCasa} dias, Código de Professor: ${codigoProfessor} e horas de Monitoria: ${horasDeMonitoria}h"
    }

    //sobreescrevendo a função hashCode() para exibir o "ID" do hashCode igual ao valor da variável codigoProfessor:
    override fun hashCode(): Int {
        return this.codigoProfessor
    }
}