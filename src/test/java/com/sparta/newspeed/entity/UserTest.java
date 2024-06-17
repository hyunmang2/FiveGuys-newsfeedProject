package com.sparta.newspeed.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    @BeforeEach
    void setUp() {
        user = User.builder()
                .id(1L)
                .nickname("wowow1981111")
                .password("wowow1980000")
                .username("현망망이")
                .email("wowow19811@gmail.com")
                .introduce("하이용.")
                .userStatus(UserStatusEnum.NORMAL)
                .build();
    }

    @Test
    @DisplayName("로그인 테스트")
    public void loginTest() {

        // given (테스트에 필요한 데이터)
        String nickname = "wowow1981111";
        String password = "wowow1980000";
        String username = "현망망이";
        String email = "wowow19811@gmail.com";
        String introduce = "하이용.";

        // when (실제로 실행)
        user = User.builder()
                .id(1L)
                .nickname("wowow1981111")
                .password("wowow1980000")
                .username("현망망이")
                .email("wowow19811@gmail.com")
                .introduce("하이용.")
                .userStatus(UserStatusEnum.NORMAL)
                .build();

        // then (결과 값을 체크)
        assertEquals(nickname, user.getNickname());
        assertEquals(password, user.getPassword());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(introduce, user.getIntroduce());
        assertEquals(UserStatusEnum.NORMAL, user.getUserStatus());


    }





}