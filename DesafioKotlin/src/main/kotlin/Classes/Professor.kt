package Classes

// Alterando a Classe Professor para uma Classe do tipo abstrata,
// pois teremos uma classe de ProfessorTitular e ProfessorAdjunto que herdarão da Classe Professor.
// E assim apenas as Classes ProfessorTitular e ProfessorAdjunto poderão ser instanciadas.
abstract class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoProfessor: Int)