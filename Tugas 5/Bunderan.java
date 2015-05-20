class Bunderan {
	int radius;
	double luas;
	double keliling;

	public Lingkaran(int radiuslingkaran){
		radius= radiuslingkaran;
	}
	public double luas(){
		luas=radius*radius*Math.PI;
		return luas;
	}
	public double keliling(){
		keliling= 2*radius*Math.PI;
		return keliling;
	}
	public void tampilkanProperty(){
		System.out.print("radius="+radius);
	}
}