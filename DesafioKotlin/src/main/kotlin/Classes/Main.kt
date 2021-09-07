package Classes

import java.util.*

fun main() {

    //PARTE A: criando as variáveis alunos:
    var aluno = Alunos("Mickey", "Mouse", 1)
    var aluno1 = Alunos("Minnie", "Mouse", 2)

    var listaAlunos = mutableListOf(aluno, aluno1)

    //comparando se aluno e aluno1 são iguais:
    println(aluno == aluno1)

    //imprimindo na tela as informações do aluno:
    println(aluno.toString())
    println(aluno1.toString())

    //imprimindo os hashCode() de cada aluno, o qual será o valor do seu códigoAluno:
    println(aluno.hashCode())
    println(aluno1.hashCode())

    println("---------------------------------------------------------------------------------------------------------")

    //PARTE D: criando as variáveis dos Professores Adjunto e Titular:
    var professorTitular = ProfessorTitular("Nicloas", "Tesla", 1500, 9901, "Java")
    var professorTitular1 = ProfessorTitular("Stephen", "Hawking", 1354, 9901, "Kotlin")
    var listaProfessoresTitular = mutableListOf(professorTitular, professorTitular1)

    //comparando se professorTitular e professorTitular1 são iguais:
    println(professorTitular == professorTitular1)

    //imprimindo na tela as informações dos Professores Titulares:
    println(professorTitular.toString())
    println(professorTitular1.toString())

    //imprimindo os hashCode() de cada Professor Titular, o qual será o valor do seu códigoProfessor:
    println(professorTitular.hashCode())
    println(professorTitular1.hashCode())

    println("---------------------------------------------------------------------------------------------------------")

    var professorAdjunto = ProfessorAdjunto("Albert", "Einstein", 957, 8802, 25954)
    var professorAdjunto1 = ProfessorAdjunto("Isaac", "Newton", 875, 8802, 22222)
    var listaProfessorAdjunto = mutableListOf(professorAdjunto, professorAdjunto1)

    //comparando se professorAdjunto e professorAdjunto1 são iguais:
    println(professorAdjunto == professorAdjunto1)

    //    //imprimindo na tela as informações dos Professores Adjuntos:
    println(professorAdjunto.toString())
    println(professorAdjunto1.toString())

    //imprimindo os hashCode() de cada Professor Adjunto, o qual será o valor do seu códigoProfessor:
    println(professorAdjunto.hashCode())
    println(professorAdjunto1.hashCode())

    println("---------------------------------------------------------------------------------------------------------")

    //PARTE E: criando as variáveis do curso:

    var curso = Curso("FullStack", 20001, professorTitular, professorAdjunto, 3)
    var curso1 = Curso("Android", 20002, professorTitular1, professorAdjunto1, 20)
    var listaCursos = mutableListOf(curso, curso1)


    println(curso.adicionarUmAluno(aluno))
    println(curso.adicionarUmAluno(aluno1))
    println(curso.adicionarUmAluno(aluno))

    println(curso.listaAlunos)
//    curso.excluirAluno(aluno1)
//    println(curso.listaAlunos)
//    curso.excluirAluno(aluno)
//    println(curso.listaAlunos)
//    curso.excluirAluno(aluno)


    println("---------------------------------------------------------------------------------------------------------")
    //comparando se curso e curso1 são iguais:
    println(curso == curso1)
    println(curso.listaAlunos)

    //imprimindo na tela as informações do curso:
    println(curso.toString())
    println(curso1.toString())

    //imprimindo os hashCode() de cada curso, o qual será o valor do seu códigoCurso:
    println(curso.hashCode())
    println(curso1.hashCode())

    println("---------------------------------------------------------------------------------------------------------")

    //PARTE F: criando as variáveis da matricula:
    var matricula = Matricula(aluno, curso)
    var matricula1 = Matricula(aluno1, curso1)
    var listaMatriculas = mutableListOf(matricula, matricula1)

    println(matricula.dataMatricula)
    println(matricula)


    println("---------------------------------------------------------------------------------------------------------")

    //PARTE I (item1): implementando a função registrarCurso()
    var managerDH = DigitalHouseManger(listaAlunos, listaProfessoresTitular, listaProfessorAdjunto, listaMatriculas)

    println("Lista de Cursos Registrados:")
    managerDH.registrarCurso("FullStack", 90001, 2)
    managerDH.registrarCurso("Android", 90002, 2)

    println("---------------------------------------------------------------------------------------------------------")

    //PARTE I (item2): implementando a função excluirCurso()

    println(managerDH.listaDeCurso)
    managerDH.excluirCurso(90008)
    managerDH.excluirCurso(90001)
    println(managerDH.listaDeCurso)

    println("---------------------------------------------------------------------------------------------------------")

}