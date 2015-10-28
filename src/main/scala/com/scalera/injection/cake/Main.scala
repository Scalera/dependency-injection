package com.scalera.injection.cake

import com.scalera.injection.repository.cake.RepositoryComponentImpl

object Main extends App {

  val system = System

  println(system.get(1))

  println(system.get(3))

  // object TestSystem extends Service with RepositoryDummy
}

object System extends Service with RepositoryComponentImpl