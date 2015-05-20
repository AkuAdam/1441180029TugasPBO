class segitiga {
	double panjangSegitiga;
	double tinggiSegitiga;
	double tinggi;
	double luas;
	double panjang;
	double keliling;

	public segitiga(double tinggi, double panjang){
		tinggiSegitiga=tinggi;
		panjangSegitiga=panjang;
	}
	public void gntproperty(double tinggi, double panjang){
	tinggiSegitiga = tinggi
	panjangSegitiga = panjang
	}
	public double luas(){
		luas = 0.5*panjang*tinggi;
		return  luas;
	}
	public double keliling(){
		double sisiMiring=Math.sqrt(panjang*panjang)+(tinggi*tinggi));
keliling=panjang+tinggi+sisiMiring;
return keliling
	}
	public void tampilkanProperty(){
		System.out.print("Tinggi Segitiga="+ tinggiSegitiga);
		System.out.print("Panjang Segitiga"+ panjangSegitiga);
	}
}