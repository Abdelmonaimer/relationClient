package ma.project.relationclient.services;

import ma.project.relationclient.entities.Contrat;
import ma.project.relationclient.repositories.ContratRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratService {
    @Autowired
    private ContratRepository contratRepo;

    public List<Contrat> findAll(){return contratRepo.findAll();}
    public Contrat save(Contrat contrat){
        return contratRepo.save(contrat);
    }
    public Optional<Contrat> findById(int id){
        return contratRepo.findById(id);
    }
    public void deleteById(int id){
        contratRepo.deleteById(id);
    }
    public void update(Contrat contrat){
        contratRepo.save(contrat);
    }
}
