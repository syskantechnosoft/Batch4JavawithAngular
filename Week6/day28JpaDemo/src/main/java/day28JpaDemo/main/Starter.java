package day28JpaDemo.main;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrudOperation crudOperations = new CrudOperation();
		crudOperations.insertEntity();
		crudOperations.findEntity();
		crudOperations.updateEntity();
		crudOperations.removeEntity();
	}

}
