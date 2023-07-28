package com.devcourse.springbootjpa.domain.order;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "member")
@Getter
@Builder
@AllArgsConstructor
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	@Column(name = "name", nullable = false, length = 30)
	private String name;

	@Column(name = "nick_name", nullable = false, length = 30, unique = true)
	private String nickname;

	@Column(name = "age", nullable = false)
	private int age;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "description", nullable = false)
	private String description;

	@OneToMany(mappedBy = "member")
	private List<Order> orders = new ArrayList<>();

	protected Member() {
	}

	public void addOrder(Order order) {
		order.setMember(this);
	}
}
