class mahasiswa {
	private String nama;
	private int umur

	public mahasiswa(String namaIn, int umurIn){
		nama = namaIn
		umur = umurIn

	}

	public void tampilkanBiodata(){
		System.out.println("BIODATA");
		System.out.print("Nama :"+getNama());
		System.out.print("Umur :"+getUmur());
	}

	public void setNama(String n){
		nama = n;
	}
	public void setUmur(int u){
		umur = u;
	}
	public String getNama(){
		return nama;
	}
	public int getUmur(){
		return umur;
	}
}
