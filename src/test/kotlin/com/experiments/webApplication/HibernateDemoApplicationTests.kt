package com.experiments.webApplication

import com.experiments.webApplication.domain.Address
import com.experiments.webApplication.domain.Person
import com.experiments.webApplication.repository.PersonRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
@SpringBootTest
class HibernateDemoApplicationTests(@Autowired val repo: PersonRepository) {

    @Test
    fun `basic entity checks`() {
        val p = Person("Paul", 30, Address("HelloStreet", "Paris"))
        val hashCodeBefore = p.hashCode()
        val personSet = hashSetOf(p)
        repo.save(p)
        val hashCodeAfter = p.hashCode()
        assertThat(repo.findAll()).hasSize(1)
        assertThat(personSet).contains(p)
        assertThat(hashCodeAfter).isEqualTo(hashCodeBefore)
    }
}