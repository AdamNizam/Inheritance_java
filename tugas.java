public class tugas {
    public static void main(String[] args) {
        String nama = "Adam Nizam";
        String Nim = "TI17200001";
        String jurusan = "Tehnik Informatika-";
        char Codekelas = 'A';
        int nilaiKuis = 70;
        int Uts = 85;
        int Uas = 90;
        int Tugas = 90;
        int Praktik = 70;
        int Rata_rata = Uas * Uts / Tugas + Praktik - nilaiKuis;
        // jika ada penambahan nilai / Remidi
        Rata_rata += 0;
        System.out.println("Nama Anda :" + nama);
        System.out.println("Nim anda :" + Nim);
        System.out.println("jurusan Anda :" + jurusan + Codekelas);
        System.out.println("Nilai Rata-rata :" + Rata_rata);
        if (Rata_rata > 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        if (Rata_rata >= 95) {
            System.out.println("Grande A");
        } else if (Rata_rata >= 85) {
            System.out.println("Grade B+");
        } else if (Rata_rata >= 80) {
            System.out.println("Grade B");
        } else if (Rata_rata >= 70) {
            System.out.println("Grade C");
        } else if (Rata_rata >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

    }
}