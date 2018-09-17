
public class HinhChuNhat extends HinhHoc {
	private int dai;
	private int rong;
	private int CanhVaR;
	
	
	public HinhChuNhat(int dai, int rong) {
		this.dai = dai;
		this.rong = rong;
	}
	
	
	
	public HinhChuNhat(int CanhVaR) {
		// TODO Auto-generated constructor stub
		this.CanhVaR = CanhVaR;
	}
		

	public int getCanhVaR() {
		return CanhVaR;
	}



	public void setCanhVaR(int CanhVaR) {
		this.CanhVaR = CanhVaR;
	}



	public int getDai() {
		return dai;
	}



	public void setDai(int dai) {
		this.dai = dai;
	}



	public int getRong() {
		return rong;
	}



	public void setRong(int rong) {
		this.rong = rong;
	}



	@Override
	public void disp() {
		System.out.println("\n");
		System.out.println("Hien thi hinh chu nhat co chieu dai " + getDai() + " va chieu rong " +getRong());
		System.out.println("=====================");
		tinhDienTich();
		tinhChuVi();
		
	}
	@Override
	public void tinhDienTich() {
		System.out.println("Dien tich hinh chu nhat la:" + (getDai() *  getRong()));
	}
	@Override
	public void tinhChuVi() {
		System.out.println("Chu vi hinh chu nhat la:"+ (getDai()+getRong())*2 );
		
	}
	
	
	

}
