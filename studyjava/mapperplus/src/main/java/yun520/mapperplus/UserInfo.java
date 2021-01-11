package yun520.mapperplus;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -8938650956516110149L;
    @PrimaryKey
    private Long userId;
    private String name;
    private Integer age;
}