public class BluRay extends AudioVisual {
    private int duracao;

    public BluRay(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public double calculaPrecoVenda() {
        double pv = (super.precoBase * duracao) / 100;
        return pv;
    }

    @Override
    public double calculaImposto() {
        double pv = calculaPrecoVenda();
        double imp = pv * 0.4;
        return imp;
    }
}
