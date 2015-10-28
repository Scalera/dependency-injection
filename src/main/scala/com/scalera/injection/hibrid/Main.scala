package com.scalera.injection.hibrid

import com.scalera.injection.repository.cake.{ RepositoryComponentImpl, RepositoryComponent }
import scalaz.Reader

object Main extends App {

  val system = MySystem

  println(system.getStringByInt(1))

  println(system.getStringByInt(3))

}

trait System extends Service {
  self: RepositoryComponent =>

  def getStringByInt(k: Int): String =
    get(k)(repository)
}

object MySystem extends System with RepositoryComponentImpl
