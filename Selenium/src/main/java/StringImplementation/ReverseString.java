package StringImplementation;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String text= "Leaf";
    char[] ar=text.toCharArray();
    for(int i=ar.length-1;i>=0;i--){
    	System.out.println(ar[i]);
    }
	}

}
