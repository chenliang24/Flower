package ע��;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = { ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE })   //���ע���ܷ���ʲô�ط�
public @interface Id {
     String name();
     int age();
}
