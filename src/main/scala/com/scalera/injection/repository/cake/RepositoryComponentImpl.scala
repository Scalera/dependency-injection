package com.scalera.injection.repository.cake

import com.scalera.injection.repository.RepositoryImpl

trait RepositoryComponentImpl extends RepositoryComponent {

  val repository = new RepositoryImpl{}
}

