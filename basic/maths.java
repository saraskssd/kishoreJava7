 class TestMath {
	public static void main(String[] args){
		System.out.println("Exponents :"+Math.E);
		System.out.println("Value of pi :"+Math.PI);
		System.out.println("round() :"+Math.round(8.598));
		System.out.println("ceil() :"+Math.ceil(8.5));
		System.out.println("floor() :"+Math.floor(8.5));
		double temp=0;
		long round=0;
		String size=null;
		do{
		temp=Math.random();
		round=Math.round(temp*100000);
		size=String.valueOf(round);
		}while(size.length()!=5);
	System.out.println("Exponents :"+round);

}





}