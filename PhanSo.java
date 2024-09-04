package Nhuy23718321;

public class PhanSo {

	private int tuSo;
	private int mauSo;

	// Constructor ko ts
	public PhanSo() {
	}

	// Constructor có ts
	public PhanSo(int tuSo, int mauSo) throws Exception {
		if (mauSo == 0) {
			throw new Exception("Mẫu số không thể bằng 0.");
		}
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	// Getter, Setter
	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) throws Exception {
		if (mauSo == 0) {
			throw new Exception("Mẫu số không thể bằng 0.");
		}
		this.mauSo = mauSo;
	}

	// Tính giá trị
	public double getGiaTri() {
		return (double) tuSo / mauSo;
	}

	// Cộng
	public PhanSo cong(PhanSo ps) throws Exception {
		int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
		int mau = this.mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Trừ
	public PhanSo tru(PhanSo ps) throws Exception {
		int tu = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
		int mau = this.mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Nhân
	public PhanSo nhan(PhanSo ps) throws Exception {
		int tu = this.tuSo * ps.tuSo;
		int mau = this.mauSo * ps.mauSo;
		return new PhanSo(tu, mau);
	}

	// Chia
	public PhanSo chia(PhanSo ps) throws Exception {
		if (ps.tuSo == 0) {
			throw new Exception("Không thể chia cho phân số có tử số bằng 0.");
		}
		int tu = this.tuSo * ps.mauSo;
		int mau = this.mauSo * ps.tuSo;
		return new PhanSo(tu, mau);
	}

	@Override
	public String toString() {
		return String.format("%d/%d", tuSo, mauSo);
	}
}
