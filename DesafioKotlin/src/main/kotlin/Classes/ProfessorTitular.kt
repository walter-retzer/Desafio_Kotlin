package Classes

//A classe ProfessorTitular herdará da Classe Abstrata Professor:
class ProfessorTitular(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, var especialidade: String) :
    Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {

    //sobrescrevendo as funções equals(), toString() e hashCode():

    //sobreescrvendo a Função equals() para caso o códigoProfessor for igual, retorne true:
    override fun equals(other: Any?): Boolean {
        return (other is ProfessorTitular && other.codigoProfessor == this.codigoProfessor)
    }

    //sobreescrevendo a Função toString() para exibir informações do Professor Titular:
    override fun toString(): String {
        return "O Professor(a) Titular: ${nome} ${sobrenome} possui Tempo de Casa: ${tempoDeCasa} dias, Código de Professor: ${codigoProfessor} e Especialidade: ${especialidade}"
    }

    //sobreescrevendo a função hashCode() para exibir o "ID" do hashCode igual ao valor da variável codigoProfessor:
    override fun hashCode(): Int {
        return this.codigoProfessor
    }
}