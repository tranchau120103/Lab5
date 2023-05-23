package Lab5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyPhongHoc quanLyPhongHoc = new QuanLyPhongHoc();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("3. In danh sách phòng học");
            System.out.println("4. In danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách phòng học theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách phòng học theo diện tích");
            System.out.println("7. Sắp xếp danh sách phòng học theo số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính");
            System.out.println("9. Xóa phòng học");
            System.out.println("10. In tổng số phòng học");
            System.out.println("11. In danh sách các phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự new line sau khi đọc số nguyên

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = scanner.nextLine();
                    System.out.print("Nhập diện tích: ");
                    double dienTich = scanner.nextDouble();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = scanner.nextInt();
                    System.out.print("Loại phòng học (1 - Phòng lý thuyết, 2 - Phòng máy tính, 3 - Phòng thí nghiệm): ");
                    int loaiPhong = scanner.nextInt();
                    scanner.nextLine(); // Đọc bỏ ký tự new line sau khi đọc số nguyên

                    if (loaiPhong == 1) {
                        System.out.print("Có máy chiếu (true/false): ");
                        boolean coMayChieu = scanner.nextBoolean();
                        PhongLyThuyet phongLyThuyet = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen, coMayChieu);
                        quanLyPhongHoc.themPhongHoc(phongLyThuyet);
                    } else if (loaiPhong == 2) {
                        System.out.print("Nhập số máy tính: ");
                        int soMayTinh = scanner.nextInt();
                        PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen, soMayTinh);
                        quanLyPhongHoc.themPhongHoc(phongMayTinh);
                    } else if (loaiPhong == 3) {
                        scanner.nextLine(); // Đọc bỏ ký tự new line sau khi đọc số nguyên
                        System.out.print("Nhập chuyên ngành: ");
                        String chuyenNganh = scanner.nextLine();
                        System.out.print("Nhập sức chứa: ");
                        int sucChua = scanner.nextInt();
                        System.out.print("Có bồn rửa (true/false): ");
                        boolean coBonRua = scanner.nextBoolean();
                        PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen, chuyenNganh, sucChua, coBonRua);
                        quanLyPhongHoc.themPhongHoc(phongThiNghiem);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã phòng cần tìm: ");
                    String maPhongTimKiem = scanner.nextLine();
                    if (quanLyPhongHoc.timPhongHoc(maPhongTimKiem)) {
                        System.out.println("Tìm thấy phòng học có mã phòng " + maPhongTimKiem + ".");
                    } else {
                        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhongTimKiem + ".");
                    }
                    break;
                case 3:
                    quanLyPhongHoc.inDanhSachPhongHoc();
                    break;
                case 4:
                    quanLyPhongHoc.inDanhSachPhongHocDatChuan();
                    break;
                case 5:
                    quanLyPhongHoc.sapXepTheoDayNha();
                    break;
                case 6:
                    quanLyPhongHoc.sapXepTheoDienTich();
                    break;
                case 7:
                    quanLyPhongHoc.sapXepTheoSoBongDen();
                    break;
                case 8:
                    System.out.print("Nhập mã phòng máy tính cần cập nhật: ");
                    String maPhongCapNhat = scanner.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = scanner.nextInt();
                    quanLyPhongHoc.capNhatSoMayTinh(maPhongCapNhat, soMayTinhMoi);
                    break;
                case 9:
                    System.out.print("Nhập mã phòng học cần xóa: ");
                    String maPhongXoa = scanner.nextLine();
                    System.out.print("Bạn có chắc chắn muốn xóa? (true/false): ");
                    boolean xacNhanXoa = scanner.nextBoolean();
                    if (xacNhanXoa) {
                        quanLyPhongHoc.xoaPhongHoc(maPhongXoa);
                    }
                    break;
                case 10:
                    int tongSoPhongHoc = quanLyPhongHoc.tongSoPhongHoc();
                    System.out.println("Tổng số phòng học: " + tongSoPhongHoc);
                    break;
                case 11:
                    quanLyPhongHoc.inDanhSachPhongMayTinh60May();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }

            System.out.println(); // In một dòng trống giữa các lần chạy menu
        } while (choice != 0);
    }
}
