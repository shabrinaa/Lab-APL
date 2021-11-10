class Main {
    public static void main (String[] args) {
        Kucing kucing = new Miaw();
        kucing.miaw();

        MiawAdapter miawAdapter = new MiawAdapter(kucing);
        miawAdapter.kwek();
    }
}