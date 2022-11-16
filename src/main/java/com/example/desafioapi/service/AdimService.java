package com.example.desafioapi.service;

import com.example.desafioapi.entity.Admin;
import com.example.desafioapi.repository.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdimService {

    private final AdminRepository adminRepository;

    public AdimService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public void saveAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public void deleteAdmin(Long id){
        adminRepository.deleteById(id);
    }

    public Admin buscarIdAdmin(Long id)throws Exception{
        Optional<Admin> admin = adminRepository.findById(id);
        if(admin.isEmpty()){
            throw new Exception("Admin não encontrado");
        }return admin.get();
    }

    public List<Admin> buscarTodos(){
        return adminRepository.findAll();
    }


}
