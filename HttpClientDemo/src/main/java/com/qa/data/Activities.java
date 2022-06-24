package com.qa.data;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Activities {
	private int id;
	private String title;
	private Date dueDate;
	private boolean completed;
}
