import java.util.Scanner;

interface LayananAntarBarang{
    public void AntarBarang();
}

class JNE1 implements LayananAntarBarang{
    public void AntarBarang(){
        System.out.println("KURIR JNE REGULER");
    }
}

class JNT1 implements LayananAntarBarang{
    public void AntarBarang(){
        System.out.println("KURIR JNT REGULER");
    }
}

class SiCepat1 implements LayananAntarBarang{
    public void AntarBarang(){
        System.out.println("KURIR SI CEPAT REGULER");
    }
}


class Kurir{
    private LayananAntarBarang KurirShopee;

    public void setLayananAntarBarang(LayananAntarBarang KurirShopee){
        this.KurirShopee = KurirShopee;
    }

    public LayananAntarBarang getlayananAntarBarang(){
        return this.KurirShopee;
    }

    public void AntarBarang(){
        KurirShopee.AntarBarang();
    }

}

