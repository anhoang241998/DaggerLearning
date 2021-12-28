package com.annguyenhoang.daggerlearning.dependency_injection_manual

object Container {

    fun provideDriver() = Driver()

    fun provideEngine() = Engine()

}