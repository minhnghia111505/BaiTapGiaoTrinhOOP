package bai12;

import java.util.Scanner;

//Lớp trừu tượng Nguoi
abstract class Nguoi {
 private String hoTen;
 private String ngaySinh;
 private String diaChi;
 private String loaiSinhVien;

 public Nguoi(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
     this.hoTen = hoTen;
     this.ngaySinh = ngaySinh;
     this.diaChi = diaChi;
     this.loaiSinhVien = loaiSinhVien;
 }

 public void nhapThongTin() {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Nhập họ tên: ");
     hoTen = scanner.nextLine();
     System.out.print("Nhập ngày sinh: ");
     ngaySinh = scanner.nextLine();
     System.out.print("Nhập địa chỉ: ");
     diaChi = scanner.nextLine();
     System.out.print("Nhập loại sinh viên (SVCĐN hoặc SVCĐCQ): ");
     loaiSinhVien = scanner.nextLine();
 }

 public abstract double tinhDiem();

 public void inThongTin() {
     System.out.println("Họ tên: " + hoTen);
     System.out.println("Ngày sinh: " + ngaySinh);
     System.out.println("Địa chỉ: " + diaChi);
     System.out.println("Loại sinh viên: " + loaiSinhVien);
     System.out.println("Điểm trung bình: " + tinhDiem());
 }
}
