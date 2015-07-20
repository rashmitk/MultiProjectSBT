package com.sp2.test

import com.sp1.test.Man
import com.sp1.test.Woman
import com.sp1.test.Friend
import com.sp1.test.Cat
import com.sp1.test.Dog

object FriendTraitClient {
  
  def helpAsFriend(friendObj : Friend){
    friendObj.listen
  }
  
  
  def main(args: Array[String]): Unit = {
    
    val john = new Man("John")
    val jenny = new Woman("Jenny")
    val bruno = new Dog("Bruno")
    
    
    john.listen
    jenny.listen
    bruno.listen
    
    println("------------------------------------")
    
    helpAsFriend(john)
    helpAsFriend(jenny)
    helpAsFriend(bruno)
    
    println("------------------------------------")
    
    val meow = new Cat("Meow") with Friend
    meow.listen
    helpAsFriend(meow)
    
  }
}