public abstract class Comun extends Gasolina {

    public Comun() {
    }
    
    @Override
    public void vaEn(Comun com) {
        System.out.println(this.getClass().getSimpleName()+" se le pone "+  com.getClass().getSimpleName());
    }
}
