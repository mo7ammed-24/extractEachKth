fun main() {
    print(extractEachKth(mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),3))
}

fun extractEachKth(inputArray: MutableList<Int>, k: Int): MutableList<Int> {
    var m=k
    var myList=mutableListOf<Int>()
    while(m<=inputArray.size){
        myList.add(m)
        m+=k
    }
    for(i in myList.size.minus(1).downTo(0)){
        inputArray.removeAt(myList[i]-1)}

    return inputArray
}
