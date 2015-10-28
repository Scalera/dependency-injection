package com.scalera.injection.hibrid

import com.scalera.injection.repository.Repository
import scalaz.Reader

trait Service {

  def get(k: Int) =
    Reader(
      (repository: Repository) => repository.getFromRepo(k).getOrElse("Not found")
    )
}
