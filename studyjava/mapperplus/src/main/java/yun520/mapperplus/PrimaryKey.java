package yun520.mapperplus;
//type checkers
//        type annotation
//        给目标添加额外的信息。
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { FIELD, METHOD,ANNOTATION_TYPE })
public @interface PrimaryKey {
}