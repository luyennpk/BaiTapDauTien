

public abstract class HinhHoc {

	public abstract void disp();
	
	public abstract void tinhDienTich();

	public abstract void tinhChuVi();
	public static void main(String[] args) {
		HinhHoc obj1 = new HinhChuNhat(5, 10);
		obj1.disp();
		
		HinhHoc obj2 = new HinhVuong(5);
		obj2.disp();
		
		HinhHoc obj3 = new HinhTron(5);
		obj3.disp();

	}	
	

}
