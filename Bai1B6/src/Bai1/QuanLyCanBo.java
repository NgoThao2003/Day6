package Bai1;

import Bai1.KySu;
import Bai1.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    private static Scanner sc = new Scanner(System.in);
    private static int n;

    public static ArrayList<CongNhan> listCN = new ArrayList<>();
    public static ArrayList<KySu> listKS = new ArrayList<>();
    public static ArrayList<NhanVien> listNV = new ArrayList<>();

    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\t\tMENU");
            System.out.println("1: Add 1 can bo vao List tuong ung");
            System.out.println("2.Hien thi danh sach cac can bo");
            System.out.println("3.Xoa 1 can bo theo id");
            System.out.println("4:Tim kiem 1 can bo theo id id");
            System.out.println("5:Dung chuong trinh");

            System.out.print("Moi ban nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    add();
                    break;
                }

                case 2: {
                    hienThiDS();
                    break;
                }
                case 3: {
                    Xoa();
                    break;
                }

                case 4: {
                    timKiem();
                    break;
                }

                case 5: {
                    System.out.println("Dừng nhập nữa đến 5 là hết rùi!!!");
                    break;
                }
            }

        } while (chon != 5);
    }

    public static void add() {
        System.out.println("Moi ban nhap can bo can add: ");
        System.out.print("1.Cong nhan\n 2.Ky su\n 3.Nhan vien");
        int luaChon = sc.nextInt();
        switch (luaChon) {
            case 1: {
                System.out.println("==Thong tin Cong nhan");
                CongNhan cn = new CongNhan();
                cn.Input();
                listCN.add(cn);
                break;
            }

            case 2: {
                System.out.println("==Thong tin Ky su");
                KySu ks = new KySu();
                ks.Input();
                listKS.add(ks);
                break;
            }

            case 3: {
                System.out.println("==Thong tin Nhan vien");
                NhanVien nv = new NhanVien();
                nv.Input();
                listNV.add(nv);
                break;
            }

        }
    }

    public static void hienThiDS() {
        if (listCN.isEmpty()) {
            System.out.println("Danh sach cong nhan dang rong");
        } else {
            System.out.println("==Danh sach cong nhan");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
            for (int i = 0; i < listCN.size(); i++) {

                listCN.get(i).Output();
            }
        }

        if (listKS.isEmpty()) {
            System.out.println("Danh sach ky su dang rong");
        } else {
            System.out.println("==Danh sach Ky su");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh");
            for (int i = 0; i < listKS.size(); i++) {
                listKS.get(i).Output();
            }

        }

        if (listNV.isEmpty()) {
            System.out.println("Danh sach nhan vien dang rong");
        } else {
            System.out.println("==Danh sach nhan vien");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
            for (int i = 0; i < listNV.size(); i++) {
                listNV.get(i).Output();
            }
        }

    }

    public static void Xoa() {
        int id;
        int count = 0;
        System.out.print("Nhap id can xoa: ");
        id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < listCN.size(); i++) {
            if (listCN.get(i).getId() == id) {
                count++;
                System.out.println("id ban nhap trong danh cong nhan");
                listCN.remove(i);
                System.out.println("Danh scah cong nhan sau khi xoa la: ");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
                for (int j = 0; j < listCN.size(); j++) {
                    listCN.get(i).Output();
                }
            }
        }
        for (int i = 0; i < listKS.size(); i++) {
            if (listKS.get(i).getId() == id) {
                count++;
                System.out.println("id ban nhap trong danh Ky su");
                listKS.remove(i);
                System.out.println("Danh scah cong nhan sau khi xoa la: ");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh");
                for (int j = 0; j < listKS.size(); j++) {
                    listKS.get(i).Output();
                }
            }
        }
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getId() == id) {
                count++;
                System.out.println("id ban nhap trong danh cong nhan");
                listNV.remove(i);
                System.out.println("Danh scah cong nhan sau khi xoa la: ");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
                for (int j = 0; j < listNV.size(); j++) {
                    listNV.get(i).Output();
                }
            }
        }
        if (count == 0) {
            System.out.println("Id bn nhap khong ton tai");
        }
    }

    public static void timKiem() {
        int id;
        System.out.println("Nhap id muon tim");
        id = sc.nextInt();
        sc.nextLine();
        int count2 = 0;
        for (int i = 0; i < listCN.size(); i++) {
            if (listCN.get(i).getId() == id) {
                count2++;
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Bac");
                listCN.get(i).Output();
            }
        }
        for (int i = 0; i < listKS.size(); i++) {
            if (listKS.get(i).getId() == id) {
                count2++;
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh");
                listKS.get(i).Output();
            }
        }
        for (int i = 0; i < listNV.size(); i++) {
            if (listNV.get(i).getId() == id) {
                count2++;
                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Ho ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
                listNV.get(i).Output();
            }
        }

        if (count2 == 0) {
            System.out.println("Id ban nhap khong ton tai");
        }


    }
}
