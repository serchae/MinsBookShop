package com.bookshop.domain;

import lombok.Data;

@Data
public class ImageFileVO {
	private int goods_id;
	private int image_id;
	private String fileName;
	private String fileType;
	private String reg_id;
}
