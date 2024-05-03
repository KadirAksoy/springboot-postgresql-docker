package com.kadiraksoy.springbootpostgresqdocker.repository;

import com.kadiraksoy.springbootpostgresqdocker.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
