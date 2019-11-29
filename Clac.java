package calculator;

public class Clac {
	public final static char[] operations = {'+','-','*','/'};
	
	//oprations
	
	private static double kefel(double num1,double num2)
    {
        return num1 * num2;
    }

    private static double plus(double num1,double num2)
    {
        return num1 + num2;
    }
    private static double minus(double num1,double num2)
    {
        return num1 - num2;
    }
    private static double hiluk(double num1,double num2)
    {
        return num1/num2;
    }
    
    public static double check(char function, double num1, double num2) {
    	switch (function){

        case '+':
           return plus(num1, num2);
        case '-':
        	return minus(num1, num2);
        case '*':
        	return kefel(num1, num2);
        case '/':
        	return hiluk(num1, num2);
        default: 
        	return -1;
            
     }
    	
    }
    
    

}
