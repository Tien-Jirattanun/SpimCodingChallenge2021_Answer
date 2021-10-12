fun main(args: Array<String>){

    var inputString = readLine()
    var inverse =  ArrayList<String>()
    var original = ArrayList<String>()
    var arraynum: Int = (inputString!!.length)-1
    var count: Int = inputString.length-1

    //prepare
    for(i in 0..arraynum){
        original.add(i, inputString[i].toString())
        inverse.add(i, inputString[count].toString())
        count--
    }

    if(original == inverse){
        print("true")
    }else{
        print("false")
    }
}
