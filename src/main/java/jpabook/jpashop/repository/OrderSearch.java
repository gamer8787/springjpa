package jpabook.jpashop.repository;

import jpabook.jpashop.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderSearch {

    private String memberName; //회원 주문
    private OrderStatus orderStatus; //주문 상태[ORDER, CANCEL]

}
