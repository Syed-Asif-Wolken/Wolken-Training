class Division{
	public static void main(String args[]){
		int a=5,b=0,result;
		try{
			result = a/b;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Final Block");
		}
	}
}