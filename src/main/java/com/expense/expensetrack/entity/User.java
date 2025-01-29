package com.expense.expensetrack.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: shh
 * @createTime: 2025/1/1816:07
 */
@Entity
@Data
@Table(name = "user")
public class User implements Serializable {
//serialVersionUID 是 Java 类的一个成员，用于类的序列化操作
//当你要将一个 Java 对象存储到文件中，
// 并且之后可能从文件中读取并还原这个对象时，
// 序列化和反序列化就派上用场，serialVersionUID 就可以保证
// 在不同的时间点读取对象时，对象的类版本是否兼容，防止因类的修改导致的反序列化错误
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private LocalDateTime createdAt = LocalDateTime.now();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

