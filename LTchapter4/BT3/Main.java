
package BT3;


public class Main {
    public static void main(String[] args) {
        Circle ht = new Circle(5,"red",true);
        float dt,cv;
        cv = (float) (2*ht.getRadius()*ht.getPi());
        dt = (float) (ht.getPi()*(ht.getRadius()*ht.getRadius()));
        System.out.println("Chu vi la: "+cv);
        System.out.println("Dien tich la: "+dt);
    }
}
/*
1.Trong biểu đồ trên có tất cả bao nhiêu quan hệ thừa kế (is-a)? Tại sao lớp Circle có thể
thừa kế lớp Shape mà không phải lớp Rectangle?
    - có 3 quan hệ kế thừa
    - VÌ lớp circle sử dụng cả 2 thuộc tính của lớp shape. Còn ở lớp Rectangle ta không sử dụng 2 thuộc tính width và length.
2.Định nghĩa thêm số PI trong lớp Circle ở chương trình vừa tạo; sau đó sử dụng giá trị PI
để tính chu vi và diện tích hình tròn. Biến PI này có nên để final không?
    - không nên để final ở biến Pi. Vì biến Pi nằm trong 1 constructor nên không thể thay đổi giá trị của biến dù cho có 
để final hay không. :)
*/
