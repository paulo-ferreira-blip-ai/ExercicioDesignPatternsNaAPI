package com.api.aplicandoPatterns.service;

import com.api.aplicandoPatterns.model.RecebimentoModel;
import com.api.aplicandoPatterns.model.calculoRecebimento.CalculoRecebimento;
import com.api.aplicandoPatterns.model.calculoRecebimento.CalculoValorFinal;
import com.api.aplicandoPatterns.model.calculoRecebimento.FactoryRecebimento;
import com.api.aplicandoPatterns.repository.RecebimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RecebimentoService {
    @Autowired
    public RecebimentoRepository recebimentoRepository;

    public RecebimentoModel receber(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        BigDecimal resultado = FactoryRecebimento.getStatus(recebimentoModel.getStatus()).recebimentoFactory(recebimentoModel);
        recebimentoModel.setDescontoDoCartao(resultado);
        BigDecimal resultadoFinal = CalculoValorFinal.valorFinal(recebimentoModel.getValorAReceber(), recebimentoModel.getDescontoDoCartao());
        recebimentoModel.setValorFinal(resultadoFinal);

        return recebimentoRepository.save(recebimentoModel);
    }

    public List<RecebimentoModel> buscarTodos() {
        return recebimentoRepository.findAll();
    }

    public Optional<RecebimentoModel> buscarId(Long codigo) {
        return recebimentoRepository.findById(codigo);
    }

    public RecebimentoModel alterar(RecebimentoModel recebimentoModel, CalculoRecebimento calculoRecebimento) {
        BigDecimal resultado = FactoryRecebimento.getStatus(recebimentoModel.getStatus()).recebimentoFactory(recebimentoModel);
        recebimentoModel.setDescontoDoCartao(resultado);
        BigDecimal resultadoFinal = CalculoValorFinal.valorFinal(recebimentoModel.getValorAReceber(), recebimentoModel.getDescontoDoCartao());
        recebimentoModel.setValorFinal(resultadoFinal);

        return recebimentoRepository.save(recebimentoModel);
    }

    public void deletar(Long codigo) {
        recebimentoRepository.deleteById(codigo);
    }


}
