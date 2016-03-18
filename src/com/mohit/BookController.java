package com.mohit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/book")
//@Scope(value = "request")
public class BookController {

  @Autowired
  private BookRepository bookRepository;

  @RequestMapping(method = RequestMethod.POST)
  public String createBook(){
	  
	  return "post";
    
  }

  @RequestMapping(method = RequestMethod.GET, value="/{bookId}")
  public String getBookDetails(@PathVariable("bookId") String bookId){
    return "mohit";
  }
}