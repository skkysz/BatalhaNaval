fun main() {

    // Criando a matriz
    val matriz2D = Array(10) {CharArray(10){ ' '} }

    // Jogando informação para o terminal
    for ( tabuleiro in matriz2D) {
        for ( elemento in tabuleiro){
            print("$elemento")
        }
        println()
    }

}