package cn.javastack.springboot.logging.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/**
 * 功能描述:
 *
 * @author qintaxian
 * @since 2023/6/11
 */
@Data
@TableName("t_person")
public class Person {


    @TableField()
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField(insertStrategy = FieldStrategy.NOT_NULL)
    private String username;

    @TableField(insertStrategy = FieldStrategy.NOT_NULL)
    private String phone;







}
