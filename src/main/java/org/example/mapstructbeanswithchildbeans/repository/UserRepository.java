package org.example.mapstructbeanswithchildbeans.repository;

import org.example.mapstructbeanswithchildbeans.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
