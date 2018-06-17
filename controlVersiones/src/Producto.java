
public class Producto{

	private int id;
	private String nombre;
	private double pvc;
	private int ref;
	private int unidades;
	private double beneficio;
	private double iva;

	public Producto() {
		this.beneficio = 1.30;
		this.iva = 1.21;
	}
	
	public Producto(int ref) {
		this.ref = ref;
		this.beneficio = 1.30;
		this.iva = 1.21;
	}
	
	public Producto(int id, String nombre, double pvc, int ref, int unidades) {
		this.id = id;
		this.nombre = nombre;
		this.pvc = pvc;
		this.ref = ref;
		this.unidades = unidades;
		
		this.beneficio = 1.30;
		this.iva = 1.21;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPvc() {
		return pvc;
	}

	public void setPvc(double pvc) {
		this.pvc = pvc;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	
	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	/**
	 * metodo que calcula un beneficio al coste del producto
	 * @return Valor total con el beneficio
	 */
	public double damePvp() {
		double pvp = this.pvc * this.beneficio;				
		return pvp;
	}
	
	public double damePvpIva() {
		double res = this.damePvp() * this.iva;
		return res;
	}
	
	
	

}
