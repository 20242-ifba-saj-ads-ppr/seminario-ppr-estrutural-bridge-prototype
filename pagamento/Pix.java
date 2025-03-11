package pagamento;
class Pix implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}

class CartaoCredito implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Cartão de Crédito.");
    }
}

class Boleto implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado para pagamento de R$" + valor);
    }
}
