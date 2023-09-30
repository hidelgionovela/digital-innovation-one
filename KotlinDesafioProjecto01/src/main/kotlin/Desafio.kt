enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            println("${usuario.nome} foi matriculado na formação $nome.")
        } else {
            println("${usuario.nome} já está matriculado na formação $nome.")
        }
    }
}

fun main() {
    // Criação de alguns conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Banco de Dados", 120)
    val conteudo3 = ConteudoEducacional("Algoritmos Avançados", 150)

    // Criação de uma formação
    val formacao1 = Formacao("Desenvolvimento Web", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2))

    // Criação de usuários
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Bob")

    // Teste de matrícula de usuários
    formacao1.matricular(usuario1) // Alice foi matriculada na formação Desenvolvimento Web.
    formacao1.matricular(usuario2) // Bob foi matriculado na formação Desenvolvimento Web.
    formacao1.matricular(usuario1) // Alice já está matriculada na formação Desenvolvimento Web.

    // Exemplo de como verificar os inscritos na formação
    println("Inscritos na formação ${formacao1.nome}: ${formacao1.inscritos.map { it.nome }}")
}
