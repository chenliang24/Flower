package ע��;

import org.junit.Test;

public class Zhujie { // ��Ԫ����

	@Test
	public void test() throws NoSuchMethodException, SecurityException {
		Class<?> c = MyAnno.class; // ����

		Id id = (Id) c.getAnnotation(Id.class); // ���MyAnno���е�����ע��
		System.out.println(id);
		if (id.age() >= 18) {

		} else {

		}

		Id idOnMathod = c.getMethod("foo").getAnnotation(Id.class);
		System.out.println(idOnMathod);

	}

}
