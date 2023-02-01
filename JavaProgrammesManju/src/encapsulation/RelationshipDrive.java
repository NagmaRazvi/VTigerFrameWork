package encapsulation;

public class RelationshipDrive {

	public static void main(String[] args) {
		Relationship r=new Relationship("object having association like parent and child ");
	     
		r.setTypes(2);
		System.out.println(r.getTypes());
		r.sethasaRelationship("one object dependent on another object");
		System.out.println(r.gethasaRelationship());
		r.setunderstand(true);
		System.out.println(r.getunderstand());
		r.details();
		
		
		

	}

}
