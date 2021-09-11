package Classes

fun main() {

    // Instanciando a classe Manager Digital House:
    var managerDH = DigitalHouseManger()

    println("---------------------------------------------------------------------------------------------------------")

    // Criando registro dos Alunos:
    managerDH.registrarAluno("Minie", "Mouse", 55001)
    managerDH.registrarAluno("Mickey", "Mouse", 55002)
    managerDH.registrarAluno("Huguinho", "Silva", 55003)
    managerDH.registrarAluno("Luizinho", "Souza", 55004)
    managerDH.registrarAluno("Zezinho", "Oliveira", 55005)

    println("---------------------------------------------------------------------------------------------------------")

    // Registrar dois cursos.
    // Nome do curso: Full Stack
    // Código do curso: 20001
    // Quantidade máxima: 3

    managerDH.registrarCurso("FullStack", 20001, 3)

    // Nome do curso: Android
    // Código do curso: 20002
    // Quantidade máxima: 2

    managerDH.registrarCurso("Android", 20002, 2)

    println("---------------------------------------------------------------------------------------------------------")

    // Matriculando o 1° aluno no curso 20001 - FullStack:
    managerDH.matricularAluno(55001, 20001)

    println("---------------------------------------------------------------------------------------------------------")

    // Informações da Data da Matrícula:
    var aluno = Alunos("Minie", "Mouse", 55001)
    var curso = Curso("FullStack", 90001, 3)
    var matricula = Matricula(aluno, curso)
    println(matricula)

    println("---------------------------------------------------------------------------------------------------------")

    // Matriculando 2° alunos no curso 20001 - FullStack:
    managerDH.matricularAluno(55002, 20001)

    println("---------------------------------------------------------------------------------------------------------")

    // Matriculando 3 alunos no curso 20001 - FullStack:
    managerDH.matricularAluno(55003, 20002)
    managerDH.matricularAluno(55004, 20002)
    managerDH.matricularAluno(55005, 20002)

    println("---------------------------------------------------------------------------------------------------------")

    // Imprimindo a Lista de Matricula:
    println("\nLista de Matrícula Digital House: ${managerDH.listaMatriculas}\n")

    println("---------------------------------------------------------------------------------------------------------")

    //  Registrando 02 Professores Titulares:
    managerDH.registrarProfessorTitular("Albert", "Einstein", 77001, "Android")
    managerDH.registrarProfessorTitular("Stephen", "Hawking", 77002, "FullStack")

    // Registrando 02 Professores Adjuntos:
    managerDH.registrarProfessorAdjunto("Nicolas", "Tesla", 88001, 150)
    managerDH.registrarProfessorAdjunto("Isaac", "Newton", 88002, 120)

    println("---------------------------------------------------------------------------------------------------------")

    // Alocando os Professores Titular e Adjunto ao Curso FullStack
    // As informações ficaram alocadas dentro da lista de Cursos:
    managerDH.alocarProfessores(20001, 77001, 88001)

    println("---------------------------------------------------------------------------------------------------------")

    // Alocando os Professores Titular e Adjunto ao Curso Android
    // As informações ficaram alocadas dentro da lista de Cursos:
    managerDH.alocarProfessores(20002, 77002, 88002)


    println("---------------------------------------------------------------------------------------------------------")

    // As informações ficaram alocadas dentro da lista de Cursos:
    managerDH.consultaCurso("Minie", "Mouse")

    println("---------------------------------------------------------------------------------------------------------")

    // As informações ficaram alocadas dentro da lista de Cursos:
    managerDH.consultaCurso("Huguinho", "Silva")

    println("---------------------------------------------------------------------------------------------------------")

    // As informações ficaram alocadas dentro da lista de Cursos, testando com um nome que não esta na lista:
    managerDH.consultaCurso("Zezinho", "Oliveira")

    println("---------------------------------------------------------------------------------------------------------")

    // As informações ficaram alocadas dentro da lista de Cursos, testando com um nome que não esta na lista:
    managerDH.consultaCurso("Batman", "Bat")

    println("---------------------------------------------------------------------------------------------------------")

}