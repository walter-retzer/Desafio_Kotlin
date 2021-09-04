package Classes

class Alunos(var nome: String, var sobrenome: String, var codigoAluno: Int) {

    //sobrescrevendo as funções equals(), toString() e hashCode():

    //sobreescrvendo a Função equals() para caso o códigoAluno for igual, retorne true:
    override fun equals(other: Any?): Boolean {
        return (other is Alunos && other.codigoAluno == this.codigoAluno)
    }

    //sobreescrevendo a Função toString() para exibir informações do Aluno:
    override fun toString(): String {
        return "Sr(a). ${nome} ${sobrenome} possui o Código de Aluno: ${codigoAluno}"
    }

    //sobreescrevendo a função hashCode() para exibir o "ID" do hashCode igual ao valor da variável codigoAluno:
    override fun hashCode(): Int {
        return this.codigoAluno
    }
}