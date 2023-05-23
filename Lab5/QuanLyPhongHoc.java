package Lab5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void themPhongHoc(PhongHoc phongHoc) {
        if (!timPhongHoc(phongHoc.getMaPhong())) {
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Thêm phòng học thành công.");
        } else {
            System.out.println("Mã phòng đã tồn tại. Không thể thêm phòng học.");
        }
    }

    public boolean timPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return true;
            }
        }
        return false;
    }

    public void inDanhSachPhongHoc() {
        System.out.println("Danh sách các phòng học:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    /**
     * 
     */
    public void inDanhSachPhongHocDatChuan() {
        System.out.println("Danh sách các phòng học đạt chuẩn:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongLyThuyet && ((PhongLyThuyet) phongHoc).getCoMayChieu()) {
                System.out.println(phongHoc.toString());
            } else if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getDienTich() / ((PhongMayTinh) phongHoc).getSoMayTinh() >= 1.5) {
                System.out.println(phongHoc.toString());
            } else if (phongHoc instanceof PhongThiNghiem && ((PhongThiNghiem) phongHoc).isCoBonRua()) {
                System.out.println(phongHoc.toString());
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo dãy nhà:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void sapXepTheoDienTich() {
        Collections.sort(danhSachPhongHoc, Comparator.comparingDouble(PhongHoc::getDienTich));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo diện tích:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(danhSachPhongHoc, Comparator.comparingInt(PhongHoc::getSoBongDen));
        System.out.println("Danh sách phòng học đã được sắp xếp tăng dần theo số bóng đèn:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc.toString());
        }
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinh) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && phongHoc.getMaPhong().equals(maPhong)) {
                ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinh);
                System.out.println("Cập nhật số máy tính thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong + ".");
    }

    public void xoaPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                danhSachPhongHoc.remove(phongHoc);
                System.out.println("Xóa phòng học thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong + ".");
    }

    public int tongSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public void inDanhSachPhongMayTinh60May() {
        System.out.println("Danh sách các phòng máy tính có 60 máy:");
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh && ((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
                System.out.println(phongHoc.toString());
            }
        }
    }
}
