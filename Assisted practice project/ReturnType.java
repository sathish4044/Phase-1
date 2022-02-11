package phase1;
public class ReturnType
{
public int CompareNum()
{
	int x = 50;
	int y = 500;
	System.out.println("x ="+ x +"\ny =" + y);

	if(x>y)
		return x;
	else
		return y;
}


	public static void main(String[] args) {
		ReturnType obj = new ReturnType();
		int result = obj.CompareNum();
		System.out.println("the greatest number among x and y is" + result);

	}
}


