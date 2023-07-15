package cl.gencina.ejercicio13

data class SuperHero(val superhero:String,
                     val publisher:String,
                     val realName:String,
                     var photo:String )

fun agregarNuevo(){
    print("Nombre de super heroe:")
    var superHero = readln()
    print("Publisher:")
    var publisher = readln()
    print("Nombre real del super heroe:")
    var realName = readln()
    print("Imagen:")
    var photo = readln()

    superHeroList.add(SuperHero(superHero,publisher,realName,photo))
}

fun imprimirTodo() {
    superHeroList.forEach {
        println(it)
    }
}

var superHeroList = mutableListOf<SuperHero>()

fun main(){
    println("Agregue el primer super heroe")
    do {
        agregarNuevo()
        println("Desea agregar un nuevo super heroe? (escriba si para agregar)")
    }while (readln() == "si" )
    imprimirTodo()
}

