object Q1{
	def main(args:Array[String])
		{
			
		}
	def prime(n:Int, i:Int=2):Boolean=n match{
		case x if(x<2) => false;
		case x if(n==2) => true;
		case x if(n%i==0) => false;
		case x if(i*i>n) => true;
		case x =>prime(n,i+1);
	}
	def notprime(n:Int, i:Int=2):Boolean= !(prime(n,i))
		
			println(prime(5));
}