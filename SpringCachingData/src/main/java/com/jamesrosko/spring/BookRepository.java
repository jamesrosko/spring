package com.jamesrosko.spring;

public interface BookRepository {
	Book getByIsbn(String isbn);
}
