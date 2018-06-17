
public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto();
		

		p1.setId(1);
		p1.setNombre("Televisión");
		p1.setPvc(100.00);
		p1.setRef(0001);
		p1.setUnidades(5);
		p1.setBeneficio(1.2);
		
		
		double precioVenta = p1.damePvp();		
		System.out.println("el precio final de venta de " + p1.getNombre() + " es " + precioVenta);
		System.out.println("el precio final con IVA de venta de " + p1.getNombre() + " es " + p1.getIva());

		System.out.println("El id de este producto " + p1.getId());
		System.out.println("El nombre de este producto " + p1.getNombre());
	

		Producto p2 = new Producto(002);		
		System.out.println("La referencia de p2 es " + p2.getRef());
	
		
		Producto p3 = new Producto(3, "Radio casette estero", 60, 003, 87);
		System.out.println("La id de p3 es " + p3.getId() );
		System.out.println("El nombre de p3 es " + p3.getNombre() );
		
		
		
		
	}
}
