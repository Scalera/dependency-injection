package com.scalera.injection.implicits

import com.scalera.injection.repository.Repository

trait Service {

  def get(k: Int)(implicit repository: Repository): String =
    repository.getFromRepo(k).getOrElse("Not found")
}

// trait MixinService extends Service {
//   def exists(k: Int)(implicit repository: Repository): String =
//     if (repository.get(k) != "Not found") true else false
// }
