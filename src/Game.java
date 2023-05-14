public class Game extends AudioVisual {
    private Categoria categoria;

    @Override
    public double calculaPrecoVenda() {
        double pv = (super.precoBase * categoria.getPercentual()) * super.precoBase;
        return pv;
    }

    @Override
    public double calculaImposto() {
        double pv = calculaPrecoVenda();
        double imp = pv * 0.5;
        return imp;
    }

}