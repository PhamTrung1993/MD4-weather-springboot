package com.codegym.service.role;

import com.codegym.model.AppRole;
import com.codegym.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RoleService implements IRoleService{
    @Autowired
    private RoleRepository roleRepo;
    @Override
    public Iterable<AppRole> findAll() {
        return roleRepo.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return roleRepo.findById(id);
    }

    @Override
    public AppRole save(AppRole appRole) {
        return roleRepo.save(appRole);
    }

    @Override
    public void remove(Long id) {
        roleRepo.deleteById(id);
    }

    @Override
    public AppRole findByName(String name) {
        return roleRepo.findAllByName(name);
    }
}
