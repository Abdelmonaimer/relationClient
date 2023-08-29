package ma.project.relationclient.services;

import ma.project.relationclient.entities.Commentaire;
import ma.project.relationclient.repositories.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentaireService {
    @Autowired
    private CommentaireRepository commentRepo;

    public List<Commentaire> findAll(){
        return commentRepo.findAll();
    }
    public Commentaire save(Commentaire commentaire){
        return commentRepo.save(commentaire);
    }
    public Optional<Commentaire> findById(int id){
        return commentRepo.findById(id);
    }
    public void deleteById(int id){
        commentRepo.deleteById(id);
    }
    public void update(Commentaire cmnt){
        commentRepo.save(cmnt);
    }
}

