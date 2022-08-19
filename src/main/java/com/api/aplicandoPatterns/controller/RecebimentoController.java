package com.api.aplicandoPatterns.controller;

import com.api.aplicandoPatterns.model.PagamentoModel;
import com.api.aplicandoPatterns.model.RecebimentoModel;
import com.api.aplicandoPatterns.model.calculoPagamento.CalculoPagamento;
import com.api.aplicandoPatterns.model.calculoRecebimento.CalculoRecebimento;
import com.api.aplicandoPatterns.service.PagamentoService;
import com.api.aplicandoPatterns.service.RecebimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/recebimentos")
public class RecebimentoController {
    @Autowired
    public RecebimentoService recebimentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentoModel receber(@RequestBody RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        return recebimentoService.receber(recebimentoModel, calculoRecebimento);
    }

    @GetMapping
    public List<RecebimentoModel> buscarTodos() {
        return recebimentoService.buscarTodos();
    }

    @GetMapping(path = "/{id}")
    public Optional<RecebimentoModel> buscarId(@PathVariable Long id) {
        return recebimentoService.buscarId(id);
    }

    @PutMapping(path = "/{id}")
    public RecebimentoModel alterar(@RequestBody RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        return recebimentoService.alterar(recebimentoModel, calculoRecebimento);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        recebimentoService.deletar(id);
    }
}