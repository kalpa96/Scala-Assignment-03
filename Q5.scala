object Q5{
	def main(args:Array[String]){
		print("Enter a Number : ");
		var n = scala.io.StdIn.readInt();
		var x = sumofEven(n);
		println("sum of even numbers : "+x);
		}

	def sumofEven(a:Int):Int={
		if(a==1 || a==0){
			return 0;
		}
		else{
			return a + sumofEven(a-2);
		}
	}
}