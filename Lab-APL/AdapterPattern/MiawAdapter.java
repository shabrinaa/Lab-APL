public class MiawAdapter implements Bebek {
    private Kucing kucing;

    public MiawAdapter(Kucing kucing) {
        this.kucing = kucing;
    }

    @Override
    public void kwek() {
        kucing.miaw();
    }
}