package com.study.mvc20220927jugeon.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
/*
@EqualsAndHashCode
@Setter
@Getter
@ToString    @Data로 한번에 가능
*/
@Data

public class UserReqDto {
    private String username;
    private String password;
    private String name;
    private String email;

}
