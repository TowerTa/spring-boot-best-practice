package cn.javastack.springboot.es.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * 微信公众号：Java技术栈
 *
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "javastack")
public class User {

    /**
     * id of user
     */
    private long id;

    /**
     * name of user
     */
    private String name;

    /**
     * sex of user
     */
    private String sex;
}
