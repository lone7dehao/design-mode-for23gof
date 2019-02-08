package main.java.com.example.demo.iteratormode.entity;

/**
 * 
 * @ClassName: Book
 * @Description: 书籍实体类
 * @author lsq-pc
 * @date 2019年2月8日
 *
 */
public class Book {

	private String name;
	
	public Book(String name) {
		super();
		setName(name);
	}

	/**
	 * @Title: getName  
	 * @Description: 这里提供get/set方法的好处是可以对值进行赋值时加以控制
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
