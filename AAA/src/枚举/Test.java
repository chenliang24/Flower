package ö��;

public class Test {
	 private Integer id;
	 private String name;
	 private static Gender gender=Gender.F;
	 private  Gender gender2 =Gender.G;
	 public static void foo(){ 
		//ö�ٷ���switch�У�
		switch(gender){
		case F:
			System.out.println("FfFfFf");
			break;
		case M:
			System.out.println("MMMMMM");
			break;
		default:
			System.out.println("default");
		} 
		          
		//����ö��
		for(Gender g : Gender.values()){   
			System.out.println(g);
		}
		
	 }
	 
	public static void main(String[] args) {
		foo();
	}

}
