package Percabangan;

public class switch02 {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs : \"Terima Kasih Pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs : \"Ulun Turun Pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Tapi Bisa lah menjawab ujian?\"");
                System.out.println("Mhs : \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs : \"Ulun Turun Pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs  : \"Kabur..\"");
                break;


        }
    }
}
}
