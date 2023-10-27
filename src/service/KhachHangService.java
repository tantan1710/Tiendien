package service;

import entities.KhachHang;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangService {
    public void inputKhachHang(Scanner scanner, ArrayList<KhachHang> khachHangs){
        System.out.println("Mời bạn nhập tên hộ dân");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập số nhà: ");
        int houseNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập mã số điện: ");
        int idelectrical = Integer.parseInt(scanner.nextLine());
        KhachHang khachHang = new KhachHang(name, houseNumber, idelectrical);
        khachHangs.add(khachHang);

    }
}
