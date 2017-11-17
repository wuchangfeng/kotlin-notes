package kotlin_know

class MyIterator(val iterator: Iterator<Int>){
    operator fun next(): Int{
        return iterator.next()
    }

    operator fun hasNext(): Boolean{
        return iterator.hasNext()
    }
}

class MyIntList{
    private val list = ArrayList<Int>()

    fun add(int: Int){
        list.add(int)
    }

    fun remove(int: Int){
        list.remove(int)
    }
}

