package main.java.com.example.demo.iteratormode.entity.itfc;

/**
 * 
 * @ClassName: Iterator
 * @Description: 迭代器需要具备的能力
 * @author lsq-pc
 * @date 2019年2月8日
 *
 */
public interface Iterator {

	public abstract boolean hasNext();
	
	public abstract Object next();
}
