package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.DemoRepository;
import com.example.demo.vo.BookRepo;
import com.example.demo.vo.BookVO;

@Controller
public class DefaultController {
	
	@Autowired
	private DemoRepository demorepository;
	
	@Autowired
	private BookRepo bookrepo;
	
	@RequestMapping(value = "/")
	public String demo() {
		List<BookVO> list = demorepository.booklist();
		System.out.println(list.size());
		BookVO book = new BookVO();
		book.setName("himan");
		book.setCategori("thisiscate");
		bookrepo.save(book);
		return "index";
	}

}
