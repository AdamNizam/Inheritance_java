public class pengkondisian {
    public static void main(String[] args) {
        int Nilai = 70;
        if (Nilai > 60) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }
        // jika nilai di bawah rata2
        if (Nilai >= 80) {
            System.out.println("grande A");

        } else if (Nilai >= 70) {
            System.out.println(" grade B");

        } else if (Nilai >= 60) {
            System.out.println(" grade c");
        }
         else {
            System.out.println("Grade D");
        }

    }

}
