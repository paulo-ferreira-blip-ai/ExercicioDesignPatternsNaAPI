package com.api.aplicandoPatterns.controller;

import com.api.aplicandoPatterns.model.PagamentoModel;
import com.api.aplicandoPatterns.model.calculoPagamento.CalculoPagamento;
import com.api.aplicandoPatterns.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/pagamentos")
public class PagamentoController {
    @Autowired
    public PagamentoService pagamentoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel pagamento(@RequestBody PagamentoModel pagamentoModel, CalculoPagamento calculoPagamento) {
        return pagamentoService.pagar(pagamentoModel, calculoPagamento);
    }

    @GetMapping
    public List<PagamentoModel> buscarTodos() {
        return pagamentoService.buscarTodos();
    }

    @GetMapping(path = "/{id}")
    public Optional<PagamentoModel> buscarId(@PathVariable Long id) {
        return pagamentoService.buscarId(id);
    }

    @PutMapping(path = "/{id}")
    public PagamentoModel alterar(@RequestBody PagamentoModel pagamentoModel, CalculoPagamento calculoPagamento) {
        return pagamentoService.alterar(pagamentoModel, calculoPagamento);
    }

    @DeleteMapping(path = "/{id}")
    public void deletar(@PathVariable Long id) {
        pagamentoService.deletar(id);
    }
}
