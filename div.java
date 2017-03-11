package tutorial;

public class div {
	private String girl;
	
	public div(String name){
		 girl=name;
	}
	public void setName(String name){
		girl=name;
	}
	
	public String getname(){
		return girl;
		}
	public void saying(){
		System.out.println("the girl nme is %s/:"+ getname());
	}
	}

/*public class div{
	private String girlname;
	public div(String name){
		girlname=name;
	}
	public void setName(String name){
		girlname=name;
		
	}
	public String getname(){
		return girlname;
	}
	public void saying(){
		System.out.println("girl name is: %s/"+getname());
	}
}*/
	