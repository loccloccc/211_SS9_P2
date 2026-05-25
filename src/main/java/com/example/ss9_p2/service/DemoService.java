package com.example.ss9_p2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DemoService {
    if (code.equals("VIP")) {
        log.info("Áp dụng thành công cho user: {}", userId);
    } else if (code.equals("EXPIRED")) {
        log.warn("Mã giảm giá đã hết hạn: {}", code);
    } else {
        log.error("Lỗi mất kết nối DB khi check mã: {}", code);
    }
}
