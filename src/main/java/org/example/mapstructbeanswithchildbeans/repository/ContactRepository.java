package org.example.mapstructbeanswithchildbeans.repository;

import org.example.mapstructbeanswithchildbeans.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
