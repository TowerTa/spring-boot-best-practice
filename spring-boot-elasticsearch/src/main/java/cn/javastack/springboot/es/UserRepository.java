package cn.javastack.springboot.es;

import cn.javastack.springboot.es.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 微信公众号：Java技术栈
 */
public interface UserRepository extends ElasticsearchRepository<User, Long> {
    /**
     * 查询用户列表, 通过用户名
     *
     * @param name 用户名
     * @return List<User> 用户列表
     */
    List<User> findByName(String name);
}

