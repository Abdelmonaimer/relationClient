package ma.project.relationclient.services;

import ma.project.relationclient.entities.Client;
import ma.project.relationclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepo;

    public List<Client> findAll(){return clientRepo.findAll();}

    public Client save(Client clt){return clientRepo.save(clt);}
    public Optional<Client> findById(int id){return clientRepo.findById(id);}

    public void deleteById(int id){clientRepo.deleteById(id);}

    public void update(Client client){
        clientRepo.save(client);
    }
}
