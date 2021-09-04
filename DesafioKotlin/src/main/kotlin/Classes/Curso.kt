package Classes

class Curso(var nomeDoCurso: String, var codigoCurso: Int ) {

    //sobrescrevendo as funções equals(), toString() e hashCode():
    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigoCurso == this.codigoCurso)
    }

    override fun toString(): String {
        return "O curso ${nomeDoCurso} possui o Código de curso: ${codigoCurso}"
    }

    override fun hashCode(): Int {
        return this.codigoCurso
    }

}