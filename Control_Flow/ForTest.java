public class ForTest {
  
    public static void main(String args[])
    {
        String array[] = { "This","is","Java","Programming" };
		String scentence="";
  
        for (int i = 0; i < array.length; i++) 
        {  
            scentence = scentence +" "+ array[i];
        } 
		System.out.println(scentence);
    }
}