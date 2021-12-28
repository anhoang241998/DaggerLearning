package com.annguyenhoang.daggerlearning.dependency_injection_manual

fun main(args: Array<String>) {
    val car = Car(Container.provideEngine(), Container.provideDriver())
}