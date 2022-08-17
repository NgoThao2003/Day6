package Bai1;

import Bai1.CanBo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;
    private static Scanner sc = new Scanner(System.in);


    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public void Input(){
        System.out.print("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
        super.Input();
    }

    public void Output(){
        super.Output();
        System.out.println(nganhDaoTao);
    }

    @Override
    public String toString() {
        return "Bai1.KySu{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
