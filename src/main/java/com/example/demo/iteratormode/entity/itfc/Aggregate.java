package main.java.com.example.demo.iteratormode.entity.itfc;

/**
 * 
 * @ClassName: Aggregate
 * @Description: 该接口表示集合或某种容器拥有进行迭代的能力
 * @author lsq-pc
 * @date 2019年2月8日
 *
 */
public interface Aggregate {
	
	public abstract Iterator iterator();
	
}
