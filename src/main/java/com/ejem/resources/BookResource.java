package com.ejem.resources;

import com.ejem.entities.Book;
import com.ejem.repositories.BookRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/books")
@Transactional
public class BookResource {

    @Inject
    private BookRepository bookRepository;

    @GET
    public List<Book> index() {

        return bookRepository.listAll();
    }

    @POST
    public Book insert(Book insertBook) {
        bookRepository.persist(insertBook);
//Comentario Agregado
        return insertBook;
    }

    @GET
    @Path("{id}")
    public Book retrive(@PathParam("id") Long id) throws NoSuchFieldException {

        var book = bookRepository.findById(id);
        if (book != null) {
            return book;
        }

        throw new NoSuchFieldException("No hay id");
    }

    @DELETE
    @Path("{id}")
    public String delete(@PathParam("id") Long id)  {

        if(bookRepository.deleteById(id)){
            return "Se ha borrado bien ";
        }else{
            return "No se Borro";
        }

    }

    @PUT
    @Path("{id}")
    public Book update(@PathParam("id") Long id, Book book) throws NoSuchFieldException {
        var updatedBook=bookRepository.findById(id);
        if(updatedBook!=null){
            updatedBook.setTitle(book.getTitle());
            updatedBook.setPubDate(book.getPubDate());
            updatedBook.setNumPages(book.getNumPages());
            updatedBook.setDescription(book.getDescription());
            bookRepository.persist(updatedBook);
            return updatedBook;
        }
        throw new NoSuchFieldException("EL ID no existe");

    }
}
