package com.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author lhh
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tokens {
    private Long id;
    private String userId;
    private String token;
    private LocalDateTime createTime;
    private LocalDateTime expireTime;
}
