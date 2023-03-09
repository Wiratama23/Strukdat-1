public class Kota <E>{
    private E element;

    public Kota(E kota){
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<>(9);
        Kota<String> namaKota = new Kota<>("Malang");

        System.out.println("Jumlah kota di jawa timur : " +jumlahKota.getElement()+" Kota");
        System.out.println("Salah satu kota di Jawa Timur : Kota "+namaKota.getElement());
    }
}
