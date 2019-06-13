package com.solar.huong.singletonpattern

class Singleton constructor() {
    init{
        println("This ($this) is a singleton.")
    }

    private object Holder{ val INSTANCE = Singleton()}

    companion object{
        //#1
        val instance : Singleton by lazy { Holder.INSTANCE }
        //#2
        @JvmStatic
        fun getInstancee():Singleton{
            return Holder.INSTANCE
        }
    }
    var b :String? = null
}