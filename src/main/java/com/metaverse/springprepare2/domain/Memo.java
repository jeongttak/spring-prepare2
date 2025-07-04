package com.metaverse.springprepare2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@NoArgsConstructor//기본생성자 생성 애너테이션
@AllArgsConstructor //모든 필드를 파라미터로 받는 생성자
public class Memo {
    private String username;
    private String content;
    private String description;
    private String password;
}
