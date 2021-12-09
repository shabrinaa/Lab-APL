import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    private static Scanner scanner;

    public static void main(String[] args) {

        System.out.println("Pilih Menu yang anda Inginkan:");
		System.out.println("1. Jenis Kurir\n2. Kecepatan Kurir");
        System.out.println("Pilihan Anda :");
		int option = Main.in.nextInt();

		switch(option) {
			case 1 :
				new Main().kurir();
				break;

			case 2:
				new Main().kurirAdapter(); 
				break;
		}
	}

    //Strategy Pattern
    void kurir(){
        System.out.println("Pilih Kurir yang anda inginkan : JNE, JNT, atau SiCepat");
        scanner = new Scanner(System.in);
        String pilih = scanner.nextLine();

        Kurir tipe = new Kurir();
        System.out.println("Jenis Kurir " + pilih);

        if("JNE".equalsIgnoreCase(pilih)){
            tipe.setLayananAntarBarang(new JNE1());
        }
        else if("JNT".equalsIgnoreCase(pilih)) {
            tipe.setLayananAntarBarang(new JNT1());
        }
        else if("SiCepat".equalsIgnoreCase(pilih)){
            tipe.setLayananAntarBarang(new SiCepat1());
        }

        tipe.AntarBarang();
    }

    // Adapter Pattern
    void kurirAdapter(){
        Kecepatan jNE = new JNE();
        KurirAdapter SpeedKurir1 = new KurirAdapter(jNE);
        System.out.println("JNE memiliki " + SpeedKurir1.getSpeed());

        Kecepatan jNT = new JNT();
        KurirAdapter SpeedKurir2 = new KurirAdapter(jNT);
        System.out.println("JNT memiliki " + SpeedKurir2.getSpeed());

        Kecepatan siCepat = new SiCepat();
        KurirAdapter SpeedKurir3 = new KurirAdapter(siCepat);
        System.out.println("SiCepat memiliki " + SpeedKurir3.getSpeed());
    }
}


        