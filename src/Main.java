import java.util.HashMap;
import java.util.Scanner;

public class Main {

    String nama, kelas, matkulPerkuliahan;
    int nim;

    public Main(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPerkuliahan = mat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Main> mhs = new HashMap<>();
        String input;
        Main data;

        mhs.put("1", new Main("putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Main("agus", "3A", "Struktur Data", 2020001));
        mhs.put("3", new Main("Arro", "3D", "Struktur Data", 2020002));

        System.out.println("Masukkan ID :");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("data Mahasiswa : " + data.nama + " kelas : " + data.kelas + " Nama Matkul praktikum: " + data.matkulPerkuliahan + " nim : " + data.nim);

        }

    }
}
