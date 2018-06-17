
public class Libro extends Producto {

	
	private String isbn;
	private String autor;
	private String editorial;
	
	
	public Libro() {
		
		
	}
	
	
	public Libro(String isbn, String autor, String editorial ) {
		super();
		this.isbn = isbn;
		this.autor = autor;
		this.editorial = editorial;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	
}
