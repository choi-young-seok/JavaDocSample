package kr.co.noel.javadoc.repository;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tb_test")
public class EntityTest {

	@Id
	@Column(name = "no")
	private Long id;
	
	@Column(name = "date", columnDefinition = "DATETIME")
	private Date date;
	
	@Column(name = "text", length = 4000)
	private String text;
}
