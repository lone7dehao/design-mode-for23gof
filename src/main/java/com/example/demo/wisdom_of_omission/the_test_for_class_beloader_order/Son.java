package main.java.com.example.demo.wisdom_of_omission.the_test_for_class_beloader_order;

public class Son extends Father {
	
	// 静态变量
	static String a = lcyhh();

	public static String lcyhh() {
		System.out.println("子类静态变量");
		return "静态变量";
	}

	// 静态语句块
	static {
		System.out.println("子类静态语句块1");
	}
	
	// 静态语句块
	static {
		System.out.println("子类静态语句块2");
	}
	
	// 静态语句块
	static {
		System.out.println("子类静态语句块3");
	}

	// 非静态变量
	String b = ppplcy();

	public String ppplcy() {
		System.out.println("子类非静态变量");
		return "子类非静态变量";
	}

	// 非静态语句块
	{
		System.out.println("子类非静态语句块1");
	}
	
	// 非静态语句块
	{
		System.out.println("子类非静态语句块2");
	}

	// 非静态方法
	public void bDisplay() {
		System.out.println("子类非静态方法");
		return;
	}

	// 静态方法
	public static void bTest() {
		System.out.println("子类静态方法");
		return;
	}

	// 构造函数
	public Son() {
		System.out.println("子类构造函数");
	}
	
	public static void creatFatherInSonClass() {
		Father father = new Father();
		father.bDisplay();
		father.bTest();
		Father father2 = new Father();
		father.bDisplay();
		father.bTest();
		//可以看出在子类中初始化父类会连带初始化子类的静态变量
		//父类静态变量
		//父类静态语句块1
		//父类静态语句块2
		//父类静态语句块3
		//子类静态变量
		//子类静态语句块1
		//子类静态语句块2
		//子类静态语句块3
		//父类非静态变量
		//父类非静态语句块1
		//父类非静态语句块2
		//父类构造函数
		//父类非静态方法
		//父类静态方法
		//父类非静态变量
		//父类非静态语句块1
		//父类非静态语句块2
		//父类构造函数
		//父类非静态方法
		//父类静态方法
	}

	public static void main(String[] args) {
		//creatFatherInSonClass();
		Father father = new Son();
	}
	//	子类不管是在何地适用new初始化对象，都会先初始化父类的对象
	//	父类静态变量
	//	父类静态语句块1
	//	父类静态语句块2
	//	父类静态语句块3
	//	子类静态变量
	//	子类静态语句块1
	//	子类静态语句块2
	//	子类静态语句块3
	//	父类非静态变量
	//	父类非静态语句块1
	//	父类非静态语句块2
	//	父类构造函数
	//	子类非静态变量
	//	子类非静态语句块1
	//	子类非静态语句块2
	//	子类构造函数

}
