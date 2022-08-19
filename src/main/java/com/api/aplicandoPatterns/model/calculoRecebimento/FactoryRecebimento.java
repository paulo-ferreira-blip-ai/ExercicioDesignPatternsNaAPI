package com.api.aplicandoPatterns.model.calculoRecebimento;

import com.api.aplicandoPatterns.model.RecebimentoModel;

import java.math.BigDecimal;

public class FactoryRecebimento {
    public static CalculoRecebimento getStatus(String status){
        if (status.equalsIgnoreCase("dinheiro") || status.equalsIgnoreCase("pix") || status.equalsIgnoreCase("cheque")){
            return new Din_Pix_Cheque();
        } else if (status.equalsIgnoreCase("credito")) {
            return new Cartao_Credito();
        } else if (status.equalsIgnoreCase("debito")) {
            return new Cartao_Debito();
        } else if (status.equalsIgnoreCase("valeRefeicao")) {
            return new Vale_Refeicao();
        }else {
            return null;
        }
    }


}
