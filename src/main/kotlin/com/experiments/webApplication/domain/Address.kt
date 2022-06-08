package com.experiments.webApplication.domain

import javax.persistence.Entity

@Entity
class Address(
    val street : String,
    val city: String
)