package cuerpogeometricos;

public class tetraedro {

	public static void main(String[] args) {

		double vertices, Area, Volumen, H ,aristas,caras;

		caras=2;
		vertices=2;

		aristas=caras+vertices;
		Area=Math.pow(aristas, 2)*Math.sqrt(3.0);
		Volumen=Math.sqrt(2)*Math.pow(aristas, 3)/12;
		H=aristas*(Math.sqrt(6)/3);

		System.out.println("El Tetraedro tiene "+ caras +" caras");
		System.out.println("El Tetraedro tiene "+ vertices+ " Vertices");
		System.out.println("El Tetraedro tiene "+ (aristas-2)+ " Aristas");
		System.out.println("El Area del Tetraedro es de: "+String.format("%.2f",Area));
		System.out.println("El Volumen del Tetraedro es de: "+String.format("%.2f",Volumen));
		System.out.println("La altura del Tetraedro es "+String.format("%.2f",H));


	}

}






