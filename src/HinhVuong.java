
public class HinhVuong extends HinhChuNhat {

	public HinhVuong(int CanhVaR) {
		super(CanhVaR);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("\n");
		System.out.println("Hien thi hinh vuong co canh la:" + getCanhVaR()) ;
		System.out.println("=====================");
		tinhDienTich();
		tinhChuVi();
	}

	@Override
	public void tinhDienTich() {
		// TODO Auto-generated method stub
		System.out.println("Dien tich hinh vuong la:" + (getCanhVaR() *  getCanhVaR()));
	}

	@Override
	public void tinhChuVi() {
		// TODO Auto-generated method stub
		System.out.println("Chu vi hinh vuong la:"+ getCanhVaR() * 4 );
	}
	
	
	

}
