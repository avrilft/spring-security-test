package cn.avrilft.spring.security.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("s_role")
public class Role {

    private Long id;
    private String name;
    private String display;

}
