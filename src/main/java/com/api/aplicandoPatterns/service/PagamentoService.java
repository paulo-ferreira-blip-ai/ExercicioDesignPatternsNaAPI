package com.api.aplicandoPatterns.service;


import com.api.aplicandoPatterns.model.PagamentoModel;
import com.api.aplicandoPatterns.model.calculoPagamento.CalculoPagamento;
import com.api.aplicandoPatterns.model.calculoPagamento.FactoryPagamento;
import com.api.aplicandoPatterns.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    public PagamentoRepository pagamentoRepository;

    public PagamentoModel pagar(PagamentoModel pagamentoModel, CalculoPagamento calculoPagamento){
        BigDecimal resultado = FactoryPagamento.getStatus(pagamentoModel.getStatus()).pagamentFactory(pagamentoModel);
        pagamentoModel.setValorPago(resultado);
        return pagamentoRepository.save(pagamentoModel);
    }
    public List<PagamentoModel> buscarTodos(){
        return pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> buscarId(Long codigo){
        return pagamentoRepository.findById(codigo);
    }

    public PagamentoModel alterar(PagamentoModel pagamentoModel, CalculoPagamento calculoPagamento){

        BigDecimal resultado = FactoryPagamento.getStatus(pagamentoModel.getStatus()).pagamentFactory(pagamentoModel);
        pagamentoModel.setValorPago(resultado);
        return pagamentoRepository.save(pagamentoModel);
    }

    public void deletar(Long codigo){
        pagamentoRepository.deleteById(codigo);
    }





}
