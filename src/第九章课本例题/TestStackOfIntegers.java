package µÚ¾ÅÕÂ¿Î±¾ÀıÌâ;


public class TestStackOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfnetegers stack = new StackOfnetegers();
		
		for(int i = 0; i < 10; i++)
			stack.push(i);
		
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}

}
