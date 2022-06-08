package com.experiments.webApplication.domain

import javax.persistence.Entity

@Entity
class Person (
    val name : String,
    val age : Int,
    val address: Address
)

