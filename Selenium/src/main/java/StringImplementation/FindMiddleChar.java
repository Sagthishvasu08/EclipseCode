package StringImplementation;

public class FindMiddleChar {

	public static void main(String[] args) {
		String s="ABBAXXABBA";
		int count=0;
		int i=0;
	System.out.println(s.length());
	int len=s.length();
	char[] eachchar=s.toCharArray();
	for ( i=0; i<eachchar.length;i++) {
		
	System.out.println(eachchar[i]);
	
	
	}
	if(eachchar[i]=='A')
	{
		
		count=count+1;
		i++;
	}
	else
	{
		i++;
	}
	System.out.println("The length of A"+count);
	}
	
   
}

    int[]pos=new int[10];
    char[]ch=txt.tocharArray();
    for(int i=0; i<ch.length;i++{
	if(ch[i]=='A'){
	count++;
	pos[j]=i;
	j++
	}
}