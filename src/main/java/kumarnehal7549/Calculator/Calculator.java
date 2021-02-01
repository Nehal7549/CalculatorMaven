package kumarnehal7549.Calculator;

/**
 * Hello world!
 *
 */
public class Calculator 
{
    public int Addition(int num1,int num2) {
    	return num1+num2;
    }
    public int Subtract(int num1,int num2)
    {
    	return num1-num2;
    }
    public int Multiply(int num1,int num2) {
    	return num1*num2;
    }
    public int Division(int num1,int num2) {
    	if(num1==0||num2==0)return -1;
		else return num1 / num2;
    }
}
