package org.judy.manager.domain;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Builder.Default;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Manager {

	String mid, mpw;
	
	String email;
	
	String phone;
	
	String sname;
	
	@Default
	Boolean enabled = false;
	@Default
	Boolean approval = false;
	
	String logoImg;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date regdate, updatedate;
	
	
}
