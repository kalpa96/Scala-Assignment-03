object Q3{
	def main(args:Array[String]){
		print("Enter a Number : ");
		var n = scala.io.StdIn.readInt();
		var x = sum(n);
		println("sum value : "+x);
	}

	def sum(a:Int):Int={
		if(a==1){
		return 1;
		}
		
		else{
		return a + sum(a-1);	
		}
	}
}