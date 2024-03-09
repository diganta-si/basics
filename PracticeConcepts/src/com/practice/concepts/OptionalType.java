package com.practice.concepts;

import java.util.Optional;

public class OptionalType {

	public static void main(String[] args) {
		String checking = null;
		Optional<String> opt = Optional.ofNullable(checking);
		System.out.println(opt.orElse("Default value"));
	}

}
