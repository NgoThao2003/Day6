import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int n;
    public static ArrayList<PhuongTien> phuongTiens = new ArrayList<>();
    static int choose;

    public static void main(String[] args) {
        do{
            System.out.println("========MENU==========");
            System.out.println("1. Nhập thông tin và tạo danh sách các xe \n" +
                    "2. Xuất bảng kê khai tiền thuế trước bạ của các xe. \n" +
                    "3. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần\n" +
                    "4. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\n" +
                    "5. Thoát.\n");

            System.out.print("Moi ban chon yeu cau: ");
            choose = sc.nextInt();
            sc.nextLine();

            switch(choose){
                case 1:{
                    Input();
                    break;
                }
                case 2: {
                    Output();
                    break;
                }
                case 3: {
                    sapXepGiam();
                    break;
                }
                case 4: {
                    sapXepTang();
                    break;
                }
                case 5: {
                    System.out.println("Ket thuc chuong trinh");
                }
            }
        }while(choose!=5);
    }

    public static void Input(){
        PhuongTien phuongTien = new PhuongTien();
        int chon;
        System.out.println("Moi ban nhap thong tin: ");
        System.out.println("1. Nhập thông tin\n" +
                "2.tạo danh sách các xe");
        chon = sc.nextInt();

            switch(chon){
                case 1:
                    phuongTien.Input();
                    phuongTiens.add(phuongTien);
                    break;
                case 2:
                    break;

            }
    }

    public static void Output(){
        if(phuongTiens.isEmpty()) {
            System.out.println("Bang ke khai dang trong!");
        }else{
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
            for(int i=0; i<phuongTiens.size(); i++){
                phuongTiens.get(i).Output();
            }
        }

        }
    public static void sapXepGiam(){
        for(int i=0; i<phuongTiens.size(); i++){
            for(int j=i+1; j<phuongTiens.size(); j++){
                if(phuongTiens.get(i).getThue()<phuongTiens.get(j).getThue()){
                    hoanDoi(phuongTiens.get(i), phuongTiens.get(j));
                }
            }
        }
        System.out.println("Sap xep theo tien thue giam dan");
        Output();
    }

    public static void sapXepTang(){
        for(int i=0; i<phuongTiens.size(); i++){
            for(int j=i+1; j<phuongTiens.size(); j++){
                if(phuongTiens.get(i).getThue()>phuongTiens.get(j).getThue()){
                    hoanDoi(phuongTiens.get(i), phuongTiens.get(j));
                }
            }
        }
        System.out.println("Sap xep theo tien thue tang dan");
        Output();
    }
    public static void hoanDoi(PhuongTien a ,PhuongTien b ){

        PhuongTien tg = new PhuongTien();

        tg.setTenChuXe(a.getTenChuXe());
        tg.setLoaiXe(a.getLoaiXe());
        tg.setDungTich(a.getDungTich());
        tg.setTriGia(a.getTriGia());
        tg.setThue(a.getThue());


        a.setTenChuXe(b.getTenChuXe());
        a.setLoaiXe(b.getLoaiXe());
        a.setDungTich(b.getDungTich());
        a.setTriGia(b.getTriGia());
        a.setThue(b.getThue());

        b.setTenChuXe(tg.getTenChuXe());
        b.setLoaiXe(tg.getLoaiXe());
        b.setDungTich(tg.getDungTich());
        b.setTriGia(tg.getTriGia());
        b.setThue(tg.getThue());
    }

}
