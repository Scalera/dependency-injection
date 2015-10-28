package com.scalera.injection.reader

import com.scalera.injection.repository.{ RepositoryImpl, Repository }
import scalaz.Reader

object Main extends App {

  val system = MySystem

  println(system.getStringByInt(1))

  println(system.getStringByInt(3))

}

class System(repository: Repository) extends Service {

  def getStringByInt(k: Int): String =
    get(k)(repository)
    
}

object MySystem extends System(new RepositoryImpl{})
