package Bai1;

import Bai1.CanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String bac;
    private static Scanner sc = new Scanner(System.in);
    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public void Input(){
        System.out.print("Nhap bac: ");
        bac = sc.nextLine();
        super.Input();
    }

    public void Output(){

        super.Output();
        System.out.printf("%-10s\n",bac);
    }
    @Override
    public String toString() {
        return "Bai1.CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
