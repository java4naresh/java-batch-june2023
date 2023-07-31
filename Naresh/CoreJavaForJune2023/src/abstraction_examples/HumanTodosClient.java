package abstraction_examples;

public class HumanTodosClient {

	public static void main(String[] args) {
		HumanTodos us = new USCitizenTodos();
		HumanTodos india = new IndianHumans();
		india.awake();
		india.breakFast();
		india.dinner();
		us.awake();
		us.breakFast();
		us.dinner();
		//HumanTodos.metaData = "Human Todo Information for all the country";
		System.out.println(HumanTodos.metaData);

	}

}
