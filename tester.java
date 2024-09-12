import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nerapa objek yng dibuat? (max 10)");
        int jumlah = in.nextInt();
        System.out.println("cd");
        String pilihan = in.next();

        //kondisi
        if(pilihan.equals("cd")){
          cd c1 = new cd();
          c1.print();
        }else {
            System.out.println("Input salah");
        }System.out.println("masukkan jumlah product: ");
        jumlah = in.nextInt();
        if(jumlah > 10){
            System.out.println("masuk");
        }else{
            System.out.println("tidak masuk");
        }
    
       

    }
}
