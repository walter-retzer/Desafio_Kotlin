package Classes

//Além de ter um nome e código de curso, um curso possui um professor titular
//(ProfessorTitular), um professor adjunto (ProfessorAdjunto), uma quantidade
//máxima de alunos (Integer) e uma lista de alunos matriculados.

open class Curso(
    var nomeDoCurso: String,
    var codigoCurso: Int,
) {

//        //Para o construtor secundário, deve passar os parâmetros(nome e sobrenome)
//    //deve utilizar a palavra this para referenciar o construtor primário!
//    constructor(nome: String, sobrenome: String) : this(nome) {
//        this.sobrenome = sobrenome // a palavra this é utilizada para referenciar a variável sobrenome ao construtor
//    }

    var quantidadeMaximaAlunos: Int = 0

    constructor(
        nomeDoCurso: String,
        codigoCurso: Int,
        professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto,
        quantidadeMaximaAlunos: Int,
        listaAlunosMatriculados: MutableList<Alunos>


        ) : this(nomeDoCurso, codigoCurso) {
        this.nomeDoCurso = nomeDoCurso
        this.quantidadeMaximaAlunos = quantidadeMaximaAlunos
    }

    init {
        quantidadeMaximaAlunos = 10
    }

    var listaAlunos = ArrayList<Alunos>()
    var alunosAdicionados: Int = 0

    //sobrescrevendo as funções equals(), toString() e hashCode():

    //sobreescrvendo a Função equals() para caso o códigoCurso for igual, retorne true:
    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigoCurso == this.codigoCurso)
    }

    //sobreescrevendo a Função toString() para exibir informações do Curso:
    override fun toString(): String {
        return "O curso ${nomeDoCurso} possui o Código de curso: ${codigoCurso}"
    }

    //sobreescrevendo a função hashCode() para exibir o "ID" do hashCode igual ao valor da variável codigoCurso:
    override fun hashCode(): Int {
        return this.codigoCurso
    }


    // 1. Criar um método na classe Curso que permita adicionar um aluno à lista.
    // O método retornará true se o aluno puder ser adicionado ou false caso não haja vagas disponíveis.

    fun adicionarUmAluno(umAluno: Alunos): Boolean {
        if (alunosAdicionados < quantidadeMaximaAlunos) {
            listaAlunos.add(umAluno)
            alunosAdicionados++
            return true
        } else {
            println("Não há vagas disponíveis!")
            return false
        }

    }

    // 2. Criar um método na classe Curso que permita excluir um aluno da lista de alunos do curso.
    fun excluirAluno(umAluno: Alunos) {
        if (listaAlunos.isEmpty()) { // se a lista estiver vazia, não irá excluir nenhum dado.
            println("Não foi possível excluir os dados do aluno!")
        } else {
            listaAlunos.remove(umAluno)
            println("Os dados do(a) aluno(a) ${umAluno.nome} foram excluídos!")
        }

    }


}