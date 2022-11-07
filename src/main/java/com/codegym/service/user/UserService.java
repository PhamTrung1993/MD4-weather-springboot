package com.codegym.service.user;

import com.codegym.model.AppUser;
import com.codegym.model.UserPrinciple;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository appUserRepo;
    @Override
    public Iterable<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public AppUser save(AppUser user) {
        return appUserRepo.save(user);
    }

    @Override
    public void remove(Long id) {
        appUserRepo.deleteById(id);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> userOptional = appUserRepo.findByName(username);
        return userOptional.map(UserPrinciple::build).orElse(null);
    }
    @Override
    public AppUser findByName(String name) {
        return appUserRepo.findByName(name).get();
    }

}
