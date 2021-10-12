fun main(args: Array<String>){
    val a = Integer.valueOf(readLine())
    var start = 0
    for(i in 1..a){
        for (b in 0..start) {
            print("*")
        }
        start++
        println()
    }
}
