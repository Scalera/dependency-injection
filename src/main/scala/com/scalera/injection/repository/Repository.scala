package com.scalera.injection.repository

trait Repository {

  def getFromRepo(k: Int): Option[String]
  
}

