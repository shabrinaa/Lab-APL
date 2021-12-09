public class KurirAdapter implements Kecepatan {
    Kecepatan kurir;
    
    public KurirAdapter(Kecepatan kurir) {
        this.kurir = kurir;
    }

    @Override
    public String getSpeed() {
        String getHari = kurir.getSpeed();
        return getHari;
    }
}