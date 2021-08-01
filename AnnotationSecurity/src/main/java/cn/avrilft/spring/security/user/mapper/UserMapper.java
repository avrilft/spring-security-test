package cn.avrilft.spring.security.user.mapper;

import cn.avrilft.spring.security.user.entity.Role;
import cn.avrilft.spring.security.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    Role getRoleByUserId(@Param("userId") Long userId);

}
