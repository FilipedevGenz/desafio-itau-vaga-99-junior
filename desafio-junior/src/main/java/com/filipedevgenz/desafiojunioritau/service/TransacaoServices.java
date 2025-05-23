package com.filipedevgenz.desafiojunioritau.service;
import com.filipedevgenz.desafiojunioritau.appConfig.TransacaoMapper;
import com.filipedevgenz.desafiojunioritau.dto.TransacaoRequestDto;
import com.filipedevgenz.desafiojunioritau.model.Transacao;
import com.filipedevgenz.desafiojunioritau.repository.TransacaoRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TransacaoServices {
    final TransacaoRepository repository;

    public ResponseEntity<Void> recebeTransacao(@Valid TransacaoRequestDto transacao){
        repository.salvar(TransacaoMapper.INSTANCE.toEntity(transacao));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    public ResponseEntity<Void> TransacaoClear(){
        return repository.removeAll();
    }

    public ResponseEntity<List<Transacao>> getAll(){
        return ResponseEntity.ok(repository.getTransacoes());
    }

}
