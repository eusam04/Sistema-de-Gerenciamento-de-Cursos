package service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import entities.Documento;
import repository.DocumentoRepository;

@Service
public class DocumentoService{
    private final DocumentoRepository repository;

    public DocumentoService(DocumentoRepository repository) {
        this.repository = repository;
    }

    public List<Documento> listar() {
        return repository.findAll();
   
    }
    
    public Optional<Documento> buscarPorId(Long id) {
        return repository.findById(id);
    }

 
    public Documento salvar(Documento documento) {
        return repository.save(documento);
    }

    public void deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("Documento não encontrado para exclusão. ID: " + id);
        }
    }
}
