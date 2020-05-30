object Q4{
	def main(args:Array[String]){
		print("Enter a Number : ");
		var n = scala.io.StdIn.readInt();
		var a= EvenOdd(n);

		if(a==true){
			println("It is an Even number");
		}
		else{
			println("It is an Odd number");
		}		
	}

	def EvenOdd(x:Int):Boolean={
		if(x==0){
			return true;
		}
		else if(x==1){
			return false;
		}
		else{
			return EvenOdd(x-2);
		}
	}
}