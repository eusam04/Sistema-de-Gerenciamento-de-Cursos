package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Documento;
import service.DocumentoService;

@RestController
@RequestMapping("/alunos")
public class DocumentoController {
    private final DocumentoController service;

    public DocumentoController(DocumentoController service) {
        this.service = service;
    }

    @GetMapping
    public List<Documento> listar() {
        return service.listar();
    }

    @PostMapping
    public Documento salvar(@RequestBody Documento documento) {
        return service.salvar(documento);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
