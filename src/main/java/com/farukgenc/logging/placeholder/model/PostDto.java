package com.farukgenc.logging.placeholder.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created on April, 2022
 *
 * @author Faruk
 */

@Getter
@Setter
@ToString
public class PostDto {

	private long id;

	private long userID;

	private String title;

	private String body;

}
