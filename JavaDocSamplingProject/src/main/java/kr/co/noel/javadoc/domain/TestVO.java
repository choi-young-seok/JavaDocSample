package kr.co.noel.javadoc.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonInclude(Include.NON_NULL)
public class TestVO {
	
	@SerializedName("member_authentication")
	private int member_no;
	
	/**
	 * 회원인증여부
	 * <ul>
	 * <li>T : 승인
	 * <li>B : 특별관리회원
	 * <li>J : 14세미만회원
	 * </ul>
	 * @since 2019-03-02
	 **/
	@SerializedName("member_authentication")
	private String member_authentication;
	
}
