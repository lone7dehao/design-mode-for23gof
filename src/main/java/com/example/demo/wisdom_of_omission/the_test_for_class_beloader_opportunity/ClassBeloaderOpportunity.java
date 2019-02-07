package main.java.com.example.demo.wisdom_of_omission.the_test_for_class_beloader_opportunity;

/**
 * 
 * @ClassName: ClassBeloaderOpportunity
 * @Description: 用来测试Class文件被加载的时机
 * @author lsq-pc
 * @date 2019年2月7日
 *
 */
public class ClassBeloaderOpportunity {
	public static void main(String[] args) {
		// 输出结果
		// 第一个
		System.out.println(Test.A);
		// 第二个
		System.out.println(SubClass.value);
		// 第三个
		Test[] testArr = new Test[10];
		// 第四个
		Test t = new Test();
		// 第五个
		SubClass sub = new SubClass();
		SupClass su1 = new SubClass();
	}
}
//1、什么时候才会触发类的初始化？
//- 遇到new、getStatic、pubstatic、或invokestatic这4条指令时。（被final修饰、已在编译期把结果放入常量池的静态字段除外）。
//- 使用反射包的方法对类发生调用时
//- 如果初始化一个类的时候，如果发现父类还没有初始化，则需要先触发其父类的初始化。
//- 当虚拟机启动时，用户需要指定一个执行的主类（包含main（）方法的那个类），虚拟机会先初始化这个主类。有且只有以上这四中情况才会触发初始化。
//2、什么时候不会发生初始化？ 
//- 通过子类类名调用父类静态代码，不会触发子类的初始化 
//- 通过数组来创建对象不会触发此类的初始化 
//- 通过调用静态常量不会触发初始化

class Test {
	static {
		System.out.println("static is running...");
	}
	// 被final修饰、已在编译期把结果放入常量池的静态字段除外
	// 静态常量又被称为字面量
	public static final String A = "123";
}

class SupClass {
	static {
		System.out.println("Sup is Running ...");
	}
	{
		System.out.println("sup source block is running ...");
	}

	public SupClass() {
		System.out.println("sup constructor is running...");
	}

	public static int value = 1;
}

class SubClass extends SupClass {
	static {
		System.out.println("Sub is running ...");
	}

	{
		System.out.println("sub source block is running ...");
	}

	public SubClass() {
		System.out.println("sub constructor is running...");
	}
}
