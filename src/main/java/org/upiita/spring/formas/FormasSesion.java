package org.upiita.spring.formas;

import java.io.Serializable;

//import org.springframework.context.annotation.Scope;

//@Scope("session")
public class FormasSesion implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer items=0;
	public Integer getItems() {
		return items;
	}
	public void setItems(Integer items) {
		this.items = items;
	}

}
