package Classes

fun main(){

    //PARTE A: criando as variáveis alunos:
    var aluno = Alunos("Mickey", "Mouse", 1 )
    var aluno1 = Alunos("Minnie", "Mouse", 2 )

    //comparando se aluno e aluno1 são iguais:
    println(aluno == aluno1)

    //imprimindo na tela as informações do aluno:
    println(aluno.toString())
    println(aluno1.toString())

    //imprimindo os hashCode() de cada aluno, o qual será o valor do seu códigoAluno:
    println(aluno.hashCode())
    println(aluno1.hashCode())

    //PARTE B: criando as variáveis do curso:

    var curso = Curso("FullStack", 20001)
    var curso1 = Curso("Android", 20001)

    //comparando se curso e curso1 são iguais:
    println(curso == curso1)

    //imprimindo na tela as informações do curso:
    println(curso.toString())
    println(curso1.toString())

    //imprimindo os hashCode() de cada curso, o qual será o valor do seu códigoCurso:
    println(curso.hashCode())
    println(curso1.hashCode())

    var professor = Professor("Nicolas", "Tesla", 500, 9901)
    var professor1 = Professor("Albert", "Einstein", 850, 9902)

    //comparando se professor e professor1 são iguais:
    println(professor == professor1)

    //imprimindo na tela as informações do curso:
    println(professor.toString())
    println(professor1.toString())

    //imprimindo os hashCode() de cada curso, o qual será o valor do seu códigoCurso:
    println(professor.hashCode())
    println(professor1.hashCode())

}