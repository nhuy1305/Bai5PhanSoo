package Nhuy23718321;

import java.util.Scanner;

public class TestPhanSo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		try {
			// Nhập ps 1
			System.out.print("Nhập tử số của phân số 1: ");
			int tuSo1 = scanner.nextInt();
			System.out.print("Nhập mẫu số của phân số 1: ");
			int mauSo1 = scanner.nextInt();
			PhanSo ps1 = new PhanSo(tuSo1, mauSo1);

			// Nhập ps 2
			System.out.print("Nhập tử số của phân số 2: ");
			int tuSo2 = scanner.nextInt();
			System.out.print("Nhập mẫu số của phân số 2: ");
			int mauSo2 = scanner.nextInt();
			PhanSo ps2 = new PhanSo(tuSo2, mauSo2);

			// Hiển thị ps
			System.out.println("Phân số 1: " + ps1);
			System.out.println("Phân số 2: " + ps2);

			// Tính tổng hiệu tích thương
			PhanSo tong = ps1.cong(ps2);
			PhanSo hieu = ps1.tru(ps2);
			PhanSo tich = ps1.nhan(ps2);
			PhanSo thuong = ps1.chia(ps2);

			// Hiện KQ
			System.out.println("Tổng: " + tong);
			System.out.println("Hiệu: " + hieu);
			System.out.println("Tích: " + tich);
			System.out.println("Thương: " + thuong);

		} catch (Exception e) {
			System.out.println("Lỗi: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}

}
