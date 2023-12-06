package Notas;

public class CursoLiteratura extends Aluno {
    private int obrasLidas;

    public CursoLiteratura(String nome, double[] notas, int obrasLidas) {
        super(nome, "Literatura", notas);
        this.obrasLidas = obrasLidas;
    }

    @Override
    public double calculaMedia() {
        return (super.calculaMedia() + obrasLidas) / 2;
    }


    public int getObrasLidas() {
        return obrasLidas;
    }
}
