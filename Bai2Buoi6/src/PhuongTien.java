import java.util.Scanner;

public class PhuongTien {
    private static Scanner sc = new Scanner(System.in);
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thue;

    public PhuongTien(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public PhuongTien(){

    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public void Input(){
        System.out.print("Nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhap dung tich: ");
        dungTich = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap tri gia: ");
        triGia = sc.nextDouble();
        sc.nextLine();



    }

    public void Output(){
        if(dungTich<100){
            thue = (triGia*2)/100;
        } else if(dungTich<200){
            thue = (triGia*6)/100;
        }else{
            thue = (triGia*10)/100;
        }
        System.out.printf("%-20s%-20s%-20d%-20.2f%-20.2f\n", tenChuXe, loaiXe, dungTich, triGia, thue);
    }
}
