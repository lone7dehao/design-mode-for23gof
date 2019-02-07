package main.java.com.example.demo.wisdom_of_omission.the_test_for_class_beloader_order;

/**
 * 
 * @ClassName: Father
 * @Description: 测试父类的加载顺序
 * @author lsq-pc
 * @date 2019年2月7日
 *
 */
public class Father {

	// 静态变量
	static String i = lcy();

	public static String lcy() {
		System.out.println("父类静态变量");
		return "静态变量";
	}

	// 静态语句块
	static {
		System.out.println("父类静态语句块1");
	}
	
	// 静态语句块
	static {
		System.out.println("父类静态语句块2");
	}
	
	// 静态语句块
	static {
		System.out.println("父类静态语句块3");
	}

	// 非静态变量
	String j = pplcy();

	public String pplcy() {
		System.out.println("父类非静态变量");
		return "父类非静态变量";
	}

	// 非静态语句块
	{
		System.out.println("父类非静态语句块1");
	}
	
	// 非静态语句块
	{
		System.out.println("父类非静态语句块2");
	}

	// 非静态方法
	public void bDisplay() {
		System.out.println("父类非静态方法");
		return;
	}

	// 静态方法
	public static void bTest() {
		System.out.println("父类静态方法");
		return;
	}

	public Father() {
		System.out.println("父类构造函数");
	}
	
	public void creatFatherInFatherClass() {
		Father father = new Father();
		father.bDisplay();
		father.bTest();
		Father father2 = new Father();
		father.bDisplay();
		father.bTest();
	}

	public static void main(String[] args) {
		
	}

	//	根据打印出来的结果可知:
	//	类的加载顺序大致为
	//	①:静态-->非静态-->构造函数
	//	①:静态和非静态的加载都是顺序加载的
	//	②:静态和非静态方法都是可以重复调用的，只是静态方法可以使用类名直接调用
	//	③:只有静态代码块只会调用一次，所以适用于对类进行初始化
	
	//	父类静态变量
	//	父类静态语句块1
	//	父类静态语句块2
	//	父类静态语句块3
	
	//	父类非静态变量
	//	父类非静态语句块1
	//	父类非静态语句块2
	
	//	父类构造函数
	//	父类非静态方法
	//	父类静态方法
	// ################# 第二次创建对象
	//	父类非静态变量
	//	父类非静态语句块1
	//	父类非静态语句块2
	
	//	父类构造函数
	//	父类非静态方法
	//	父类静态方法

}
