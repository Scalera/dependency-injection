package com.scalera.injection.cake

import com.scalera.injection.repository.cake.RepositoryComponent

trait Service {
  self: RepositoryComponent =>

  def get(k: Int): String =
    repository.getFromRepo(k).getOrElse("Not found")
}

// trait MixinService extends Service {
//   self: RepositoryComponent =>
// }
