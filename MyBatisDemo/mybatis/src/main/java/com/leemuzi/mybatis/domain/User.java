package com.leemuzi.mybatis.domain;


import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName mybatis_user
 */

@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    private static final long serialVersionUID = 1L;


}