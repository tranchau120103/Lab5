package Lab5;

public class Phonghoc1 {
    public class Phonghoc{
        String maphong;
        String daynha;
        double dientich;
        int sobongden;
        boolean datchuan(){
            dientich = 10;
            sobongden = 1;
            return true;
        }
        public Phonghoc(String maphong, String daynha, double dientich, int sobongden) {
            this.maphong = maphong;
            this.daynha = daynha;
            this.dientich = dientich;
            this.sobongden = sobongden;     
        }
                public Phonghoc() {
        }
        public String getMaphong() {
            return maphong;
        }

        public void setMaphong(String maphong) {
            this.maphong = maphong;
        }

        public String getDaynha() {
            return daynha;
        }

        public void setDaynha(String daynha) {
            this.daynha = daynha;
        }

        public double getDientich() {
            return dientich;
        }

        public void setDientich(double dientich) {
            this.dientich = dientich;
        }

        public int getSobongden() {
            return sobongden;
        }

        public void setSobongden(int sobongden) {
            this.sobongden = sobongden;
        }
    }
    public class Phonghoclithuyet extends Phonghoc{
        boolean maychieu;

        public Phonghoclithuyet(boolean maychieu, String maphong, String daynha, double dientich, int sobongden) {
            super(maphong, daynha, dientich, sobongden);
            this.maychieu = maychieu;
        }

        public boolean isMaychieu(){
            return maychieu;
        }
        public void setMaychieu(boolean maychieu){
            this.maychieu = maychieu;
        }

        @Override
        boolean datchuan() {
            return super.datchuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    }
    public class Phongmaytinh extends Phonghoc{
        boolean maytinh;

        public Phongmaytinh(boolean maytinh, String maphong, String daynha, double dientich, int sobongden) {
            super(maphong, daynha, dientich, sobongden);
            this.maytinh = maytinh;
        }
        public void setMaytinh(boolean maytinh){
            this.maytinh = maytinh;
        }

        @Override
        boolean datchuan() {
            return super.datchuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        }
    public class Phongthinghiem extends Phonghoc{
        String thongtin;
        int succhua;
        boolean bonrua;
        
            public Phongthinghiem(String thongtin, int succhua, boolean bonrua, String maphong, String daynha, double dientich, int sobongden) {
                super(maphong, daynha, dientich, sobongden);
                this.thongtin = thongtin;
                this.succhua = succhua;
                this.bonrua = bonrua;
            }
            public String getThongtin(){
                return thongtin;
            }
            public void setThongtin(String thongtin){
                this.thongtin = thongtin;
            }
            public int getSucchua(){
                return succhua;
            }
            public void setSucchua(int succhua){
                this.succhua = succhua;
            }
            public boolean isBonrua(){
                return bonrua;
            }
            public void setBonrua(boolean bonrua){
                this.bonrua = bonrua;
            }

            @Override
            boolean datchuan() {
                return super.datchuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
    }   
    }
}
