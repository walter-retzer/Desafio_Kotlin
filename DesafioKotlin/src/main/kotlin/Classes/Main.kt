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

       //PARTE D: criando as variáveis dos Professores Adjunto e Titular:
    var professorTitular = ProfessorTitular("Nicloas", "Tesla", 1500, 9901, "Java")
    var professorTitular1 = ProfessorTitular("Stephen", "Hawking", 1354, 9901, "Kotlin")

    //comparando se professorTitular e professorTitular1 são iguais:
    println(professorTitular == professorTitular1)

    //    //imprimindo na tela as informações dos Professores Titulares:
    println(professorTitular.toString())
    println(professorTitular1.toString())

    //imprimindo os hashCode() de cada Professor Titular, o qual será o valor do seu códigoProfessor:
    println(professorTitular.hashCode())
    println(professorTitular1.hashCode())

    var professorAdjunto = ProfessorAdjunto("Albert", "Einstein", 957,8802, 25954)
    var professorAdjunto1 = ProfessorAdjunto("Isaac", "Newton",875,8802, 22222)

    //comparando se professorAdjunto e professorAdjunto1 são iguais:
    println(professorAdjunto == professorAdjunto1)

    //    //imprimindo na tela as informações dos Professores Adjuntos:
    println(professorAdjunto.toString())
    println(professorAdjunto1.toString())

    //imprimindo os hashCode() de cada Professor Adjunto, o qual será o valor do seu códigoProfessor:
    println(professorAdjunto.hashCode())
    println(professorAdjunto1.hashCode())

    //PARTE E: criando as variáveis do curso:

    var curso = Curso("FullStack", 20001, professorTitular, professorAdjunto, 40)
    var curso1 = Curso("Android", 20002, professorTitular1, professorAdjunto1, 20)

   //comparando se curso e curso1 são iguais:
    println(curso == curso1)

    //imprimindo na tela as informações do curso:
    println(curso.toString())
    println(curso1.toString())

    //imprimindo os hashCode() de cada curso, o qual será o valor do seu códigoCurso:
    println(curso.hashCode())
    println(curso1.hashCode())

}