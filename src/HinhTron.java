
public class HinhTron extends HinhVuong {

	
	
	public HinhTron(int CanhVaR) {
		super(CanhVaR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("Hien thi hinh tron co ban kinh la:" + getCanhVaR()) ;
		System.out.println("=====================");
		tinhDienTich();
		tinhChuVi();
	}

	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		System.out.println("Dien tich hinh tron la:" + (getCanhVaR() *  getCanhVaR()) * 3.14 );
	}

	@Override
	public void tinhChuVi() {
		// TODO Auto-generated method stub
		System.out.println("Chu vi hinh tron la:"+ getCanhVaR() * 2 * 3.14 );
	}
	

}
