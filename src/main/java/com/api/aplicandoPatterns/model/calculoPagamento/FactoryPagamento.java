package com.api.aplicandoPatterns.model.calculoPagamento;

public class FactoryPagamento {
    public static CalculoPagamento getStatus(String status){
        if (status.equalsIgnoreCase("pagamento_atrasado")){
            return new CalculoPagamentoAtrasado();
        } else if (status.equalsIgnoreCase("pagamento_em_dia")) {
            return new CalculoPagamentoEmDia();
        }else {
            return null;
        }
    }
}
