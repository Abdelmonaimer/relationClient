package ma.project.relationclient.services;

import ma.project.relationclient.entities.Admin;
import ma.project.relationclient.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepo;

    public List<Admin> findAll() {return adminRepo.findAll();}

    public Admin save(Admin entity) {return adminRepo.save(entity);}

    public Optional<Admin> findById(int id) {return adminRepo.findById(id);}

    public void deleteById(int id){
        adminRepo.deleteById(id);
    }
    public void update(Admin admin){
        adminRepo.save(admin);
    }

}
