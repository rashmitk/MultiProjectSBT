package com.sp1.test

class Human(override val name: String) extends Friend

class Man(override val name: String) extends Human(name)
class Woman(override val name : String) extends Human(name)


