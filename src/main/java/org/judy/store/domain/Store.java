package org.judy.store.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Store {

	private String mid,sname;
	private Integer sno;
	private double lat,lng;
	private String address,category;
	
}
