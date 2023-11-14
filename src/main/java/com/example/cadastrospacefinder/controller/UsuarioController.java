package com.example.cadastrospacefinder.controller;
import com.example.cadastrospacefinder.model.Usuario;
import com.example.cadastrospacefinder.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = {"http://localhost:5173", "http://localhost:19006"}) // Endereço do front
@RestController


@RequestMapping("/usuarios")
public class UsuarioController {
    
     @Autowired
     private UsuarioRepository usuarioRepository;
     
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    
    @DeleteMapping("/{cpf}")
    public ResponseEntity<String> deletarUsuario(@PathVariable String cpf) {
       try {
            usuarioRepository.deleteById(cpf);
            return ResponseEntity.ok("Usuário deletado com sucesso.");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{cpf}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable String cpf, @RequestBody Usuario usuarioAtualizado) {
        
        if (usuarioRepository.existsById(cpf)) {
            Usuario usuario = usuarioRepository.findById(cpf).get();
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setSobrenome(usuarioAtualizado.getSobrenome());         
            usuario.setEmail(usuarioAtualizado.getEmail());
            usuario.setSenha(usuarioAtualizado.getSenha());
            
            usuario.setMatricula(usuarioAtualizado.getMatricula());
                       
            usuario.setDisciplina(usuarioAtualizado.getDisciplina());
            usuario.setTurma(usuarioAtualizado.getTurma());
            usuario.setUsuarioTipo(usuarioAtualizado.getUsuarioTipo());

            Usuario usuarioAtualizadoBD = usuarioRepository.save(usuario);
            return ResponseEntity.ok(usuarioAtualizadoBD);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
