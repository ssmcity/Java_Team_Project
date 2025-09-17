package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		System.out.printf("상품의가격:%d원(n",value);
		System.out.printf("상품의가격:%6d원in",value);
		System.out.printf("상품의가격:%-6d원in",value);
		System.out.printf("상품의가격:%06d원ln",value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이8d인원의법이:%10.2f1n",10,area);
		
		String name="홍길동";
		string job="드적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

	}

}
