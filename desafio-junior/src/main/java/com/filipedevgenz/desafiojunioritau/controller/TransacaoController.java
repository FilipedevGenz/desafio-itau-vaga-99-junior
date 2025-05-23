package com.filipedevgenz.desafiojunioritau.controller;

import com.filipedevgenz.desafiojunioritau.appConfig.TransacaoMapper;
import com.filipedevgenz.desafiojunioritau.dto.TransacaoRequestDto;
import com.filipedevgenz.desafiojunioritau.model.Transacao;
import com.filipedevgenz.desafiojunioritau.service.TransacaoServices;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/transacao")
public class TransacaoController {

    TransacaoServices transacaoServices;

    @PostMapping
    public ResponseEntity<Void> cadastrarTransacao(@RequestBody ResponseEntity<TransacaoRequestDto> transacao) {
       return transacaoServices.recebeTransacao(transacao.getBody());
    }

    @DeleteMapping
    public ResponseEntity<Void> excluirTransacao(@RequestParam Long id){
        return transacaoServices.TransacaoClear();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Transacao>> listarTransacoes() {
        return transacaoServices.getAll();
    }
}
