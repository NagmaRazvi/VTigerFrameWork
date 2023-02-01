package encapsulation;

public class Relationship {
	private int types;
	private String hasARelationship;
	private boolean understand;
	String isARelationship;
	 //getters
	 public int getTypes()
	 {
		 return types;
	 }
	 public String gethasaRelationship()
	 {
		 return hasARelationship;
	 }
	 public boolean getunderstand()
	 {
		 return understand;
	 }
	 //setters
	 public void setTypes(int a)
	 {
		 this.types=a;
	}
	public void sethasaRelationship(String a) {
		this.hasARelationship=a;
	}
	public void setunderstand(boolean a)
	{
		this.understand=a;
	}
	
	Relationship(String a)
	{
		this.isARelationship=a;
	}
	public void details()
	{
		System.out.println(isARelationship);
	}
	
	

}
