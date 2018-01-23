
public class Test {
public static void main(String args[]){
	String s=new String("java");
	char array []=new char[5];
	String s1=new String("Java how to program ");
	String s2=new String("Introduction to JAVA ");
	if(s1.regionMatches(true,0, s2,16, 4)){
		System.out.println(" equal");
	}
	String a[]=s1.split(" ",3);
	for(String x:a){
		System.out.println(x);
	}
	int x=s1.indexOf("how");
	System.out.println(x);
	String s3=s1.trim();
	System.out.println(s3);
	boolean f=true;
	int y=548;
	String s4=String.valueOf(y);
	System.out.println(s4);
	
	StringBuilder st=new StringBuilder("java how to program");
	//st.setLength(40);
	st.ensureCapacity(50);
	//st.append(5478);
	st.insert(0,true);
	st.delete(0,4 );
	//st.deleteCharAt(4);
	
//	st.delete(0, 7);
//st.setLength(50);
	System.out.println(st.capacity());
	System.out.print(st);
}
}

