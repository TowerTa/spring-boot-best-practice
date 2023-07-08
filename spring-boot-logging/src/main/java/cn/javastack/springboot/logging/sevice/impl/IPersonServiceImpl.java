package cn.javastack.springboot.logging.sevice.impl;

import cn.javastack.springboot.logging.entity.Person;
import cn.javastack.springboot.logging.mapper.PersonMapper;
import cn.javastack.springboot.logging.sevice.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * 功能描述:
 *
 * @author qintaxian
 * @since 2023/6/11
 */
public class IPersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

}
