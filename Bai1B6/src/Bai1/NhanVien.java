package Bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;
    private static Scanner sc = new Scanner(System.in);


    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void Input(){
        System.out.println("****Nhap nhan vien");
        System.out.println("Nhap cong viec: ");
        congViec = sc.nextLine();
        super.Input();
    }

    public void Output(){
        super.Output();
        System.out.println(congViec);
    }
}
