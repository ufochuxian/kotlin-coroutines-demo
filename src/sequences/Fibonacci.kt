package sequences

fun fibonacci() = sequence {
    var terms = Pair(0, 1)
    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first + terms.second)
    }
}

fun main() {
    println(fibonacci().take(5).toList());
    println(fibonacci().take(5).toList());
}
