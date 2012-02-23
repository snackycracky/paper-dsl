Collection.metaClass.alle = { Closure closure -> // eine Closure als Argument der Methode alle also [1,2].alle({...})
    delegate.each { // alle Elemente in der Collection
        closure.delegate = closure.owner //neuzuweisung des delegierten
        closure(it) //closureaufruf
    }
}
