package yun520.mybatis_pluscode.us.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String userId;

    /**
     * 密码，需加密存储
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 类型,1管理员 2.员工 3.普通用户
     */
    private Integer type;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 0停用1启用2锁定
     */
    private Boolean status;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人id
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private String updateBy;

    private Integer sex;


}
