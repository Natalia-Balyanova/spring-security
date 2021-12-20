package com.gb.balyanova.springsecurity.repositories;

import com.gb.balyanova.springsecurity.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
