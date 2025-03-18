package pagamento;
public class Pix implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via Pix.");
    }
}
