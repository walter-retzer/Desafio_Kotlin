package Classes

fun main(){

    //PARTE A: criando as variáveis alunos:
    var aluno = Alunos("Mickey", "Mouse", 1 )
    var aluno1 = Alunos("Minnie", "Mouse", 2 )

    //comparando se aluno e aluno1 são iguais:
    println(aluno == aluno1)
    println(aluno.codigoAluno == aluno1.codigoAluno)

    //imprimindo na tela as informações do aluno:
    println(aluno.toString())
    println(aluno1.toString())

    //imprimindo os hashCode() de cada aluno, o qual será o valor do seu códigoAluno:
    println(aluno.hashCode())
    println(aluno1.hashCode())

}