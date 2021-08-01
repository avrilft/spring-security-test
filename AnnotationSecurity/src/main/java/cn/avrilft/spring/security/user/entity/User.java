package cn.avrilft.spring.security.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author yanxd
 * @version 1.0
 * @date 2021-07-30
 */
@Data
@TableName("s_user")
public class User {

    private Long id;
    private String name;
    private String password;

}
