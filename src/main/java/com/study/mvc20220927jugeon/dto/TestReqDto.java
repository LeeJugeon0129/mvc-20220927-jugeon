package com.study.mvc20220927jugeon.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
/*
@EqualsAndHashCode
@Setter
@Getter
@ToString    @Data로 한번에 가능
*/
@Data

public class TestReqDto {
    private String strData;
    private String name;
    private int number;

}
