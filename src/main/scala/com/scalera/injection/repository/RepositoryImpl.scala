package com.scalera.injection.repository

trait RepositoryImpl extends Repository {

  val m: Map[Int, String] = Map(1 -> "1", 2 -> "2")

  def getFromRepo(k: Int): Option[String] = m.get(k)

}
