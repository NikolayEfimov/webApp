package com.experiments.webApplication.repository

import com.experiments.webApplication.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
    fun getByStreet(street: String): Person?
}