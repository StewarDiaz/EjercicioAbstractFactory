public class Combustible {
    private Electricidad electricidad;
    private Gasolina gasolina;

    private Comun comun;
    private Electrico electrico;

    public void combustibleNecesario(){
        electricidad.vaEn(electrico);
        gasolina.vaEn(comun);

    }
}
