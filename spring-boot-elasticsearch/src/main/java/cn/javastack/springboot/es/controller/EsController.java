package cn.javastack.springboot.es.controller;

import cn.javastack.springboot.es.UserRepository;
import cn.javastack.springboot.es.entity.User;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.web.bind.annotation.*;

/**
 * 微信公众号：Java技术栈
 */
@RequestMapping("/es")
@RequiredArgsConstructor
@RestController
public class EsController {

    public static final String INDEX_JAVASTACK = "javastack";

    @Autowired
    private final ElasticsearchTemplate elasticsearchTemplate;

    private final UserRepository userRepository;

    /**
     * 插入
     *
     * @param name 姓名
     * @param sex  性别
     * @return User
     * @throws InterruptedException occur InterruptedException
     */
    @PostMapping("/insert")
    public User insert(@RequestParam("name") String name, @RequestParam("sex") String sex) throws InterruptedException {
        // 新增
        User user = new User(RandomUtils.nextInt(), name, sex);
        IndexCoordinates indexCoordinates = IndexCoordinates.of(INDEX_JAVASTACK);
        User save = elasticsearchTemplate.save(user, indexCoordinates);

        // 可能有延迟，休眠一秒再查询
        Thread.sleep(1000l);
        Query query = new CriteriaQuery(Criteria.where("name").is(name));
        return elasticsearchTemplate.searchOne(query, User.class, indexCoordinates).getContent();
    }

    /**
     * 新增数据
     *
     * @param name 姓名
     * @param sex  性别
     * @return User
     */
    @RequestMapping(value = "/repo/insert", method = RequestMethod.POST)
    public User repoInsert(@RequestParam("name") String name, @RequestParam("sex") String sex) {
        // 新增
        User user = new User(RandomUtils.nextInt(), name, sex);
        userRepository.save(user);

        // 查询
        return userRepository.findByName(name).get(0);
    }
}
