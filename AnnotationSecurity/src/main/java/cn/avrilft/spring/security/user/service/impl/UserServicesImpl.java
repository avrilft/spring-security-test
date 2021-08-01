package cn.avrilft.spring.security.user.service.impl;

import cn.avrilft.spring.security.user.domain.UserDetail;
import cn.avrilft.spring.security.user.entity.User;
import cn.avrilft.spring.security.user.mapper.UserMapper;
import cn.avrilft.spring.security.user.service.UserServices;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices, UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserServices userServices;

    @Override
    public User getUserByName(String name) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getName, name.trim());
        return userMapper.selectOne(wrapper);
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userServices.getUserByName(name);
        UserDetail simple = UserDetail.builder()
                .userName(user.getName())
                .password(user.getPassword())
                .authorities(AuthorityUtils.createAuthorityList("simple"))
                .build();
        return simple;
    }
}
