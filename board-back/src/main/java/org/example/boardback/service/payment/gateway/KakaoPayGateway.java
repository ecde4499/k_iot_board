package org.example.boardback.service.payment.gateway;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.boardback.dto.payment.request.PaymentCreateRequestDto;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KakaoPayGateway implements PaymentGateway {

    @Override
    public PaymentResult pay(PaymentCreateRequestDto request) {
        return null;
    }
}
