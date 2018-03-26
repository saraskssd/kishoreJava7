class Table{
	int rows;
	int colm;
	Table(){
		System.out.println("Table() created");
		rows=1;
		colm=1;
	}
	Table(int x,int y){
		System.out.println("Table(int,int) created");
		rows=x;
		colm=y;
	}
	void calculateCells(){
		int r=rows*colm;
		System.out.println("Result= "+ r);
	}
	
}
class TestProgram{
	public static void main(String args[]){
		Table t1=new Table(20,30);
		Table t2=new Table(10,10);
		Table t3=new Table();
		t3.rows=3;
		t3.colm=7;
		t1.calculateCells();
		t2.calculateCells();
		t3.calculateCells();
	}

}