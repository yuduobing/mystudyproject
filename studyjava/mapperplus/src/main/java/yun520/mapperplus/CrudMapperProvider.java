package yun520.mapperplus;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CrudMapperProvider(Class<? extends CrudMapper<?, ?>> mapperInterface) {
        // 拿到 具体的Mapper 接口  如 UserInfoMapper
        this.mapperInterface = mapperInterface;
        Type[] genericInterfaces = mapperInterface.getGenericInterfaces();
        // 从Mapper 接口中获取 CrudMapper<UserInfo,String>
        Type mapperGenericInterface = genericInterfaces[0];
        // 参数化类型
        ParameterizedType genericType = (ParameterizedType) mapperGenericInterface;

        // 参数化类型的目的是为了解析出 [UserInfo,String]
        Type[] actualTypeArguments = genericType.getActualTypeArguments();
        // 这样就拿到实体类型 UserInfo
        this.entityType = (Class<?>) actualTypeArguments[0];
        // 拿到主键类型 String
        this.primaryKeyType = (Class<?>) actualTypeArguments[1];
        // 获取所有实体类属性  本来打算采用内省方式获取
        Field[] declaredFields = this.entityType.getDeclaredFields();

        // 解析主键
        this.identifer = Stream.of(declaredFields)
        .filter(field -> field.isAnnotationPresent(PrimaryKey.class))
        .findAny()
        .map(Field::getName)
        .orElseThrow(() -> new IllegalArgumentException(String.format("no @PrimaryKey found in %s", this.entityType.getName())));

        // 解析属性名并封装为下划线字段 排除了静态属性  其它没有深入 后续有需要可声明一个忽略注解用来忽略字段
        this.columnFields = Stream.of(declaredFields)
        .filter(field -> !Modifier.isStatic(field.getModifiers()))
        .collect(Collectors.toList());
        // 解析表名
        this.table = camelCaseToMapUnderscore(entityType.getSimpleName()).replaceFirst("_", "");
        }