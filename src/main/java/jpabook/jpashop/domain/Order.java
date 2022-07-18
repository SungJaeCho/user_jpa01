package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id") //연관관계의 주인은 orders table
    private Member member;
}
