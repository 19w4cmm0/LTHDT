
package BT2;


public class HocSinhChuyenToan extends HocSinh{

    public HocSinhChuyenToan(String hoTen, int lop, int toan, int ly, int hoa){
        
    }
    HocSinhChuyenToan(){}
    @Override
    public float diemTB(){
        float DTB = (((getToan()*2) + getLy() + getHoa()) / 4);
        return DTB;
    }
}
