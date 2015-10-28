package com.scalera.injection.implicits

import com.scalera.injection.repository.RepositoryImpl

object ImplicitMain extends App {

  implicit val repository = new RepositoryImpl{}

  val system = System

  println(system.get(1))

  println(system.get(3))

}

object System extends Service