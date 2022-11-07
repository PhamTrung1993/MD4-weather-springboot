package com.codegym.repository;

import com.codegym.model.AppUser;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<AppUser, Long> {

    Optional<AppUser> findByName(String username);
}
