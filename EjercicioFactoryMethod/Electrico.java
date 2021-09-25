public class Electrico extends Electricidad {

    public Electrico() {
    }
    
    @Override
    public void vaEn(Electrico e) {
        System.out.println(this.getClass().getSimpleName()+" se le pone "+  e.getClass().getSimpleName());
    }
}
