object Q6{
	def main(args:Array[String]){
		print("Enter a Number : ");
		var n = scala.io.StdIn.readInt();
		var x = Fib(n);
		var i: Int=0;	

		for(i<-0 to n){
			print(" " +Fib(i));
		}
	}

	def Fib(a:Int):Int={
		if(a==0){
			return 0;
		}
		else if(a==1){
			return 1;
		}
		else{
			return (Fib(a-1)+Fib(a-2));
		}
	}
}