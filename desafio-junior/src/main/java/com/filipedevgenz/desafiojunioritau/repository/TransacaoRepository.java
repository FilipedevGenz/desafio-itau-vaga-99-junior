package com.filipedevgenz.desafiojunioritau.repository;

import com.filipedevgenz.desafiojunioritau.model.Transacao;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class TransacaoRepository {

    private final List<Transacao> transacoes;

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void salvar(Transacao transacao) {
        transacoes.add(transacao);
    }

    public ResponseEntity<Void> removeAll(){
        transacoes.clear();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
