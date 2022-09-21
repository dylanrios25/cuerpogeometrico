package cuerpogeometricos;

public class hexaedro {

	public static void main(String[] args) {

		double vertices, D, Volumen,
    Area,aristas,caras;

		caras=7;
		vertices=23;

		aristas=caras+vertices;
		Area=6*Math.pow(aristas, 2);
		Volumen=Math.pow(aristas, 3);
		D=aristas*Math.sqrt(3);

		System.out.println("El Hexaedro tiene "+ caras +" caras");
		System.out.println("El Hexaedro tiene "+ vertices+ " Vertices");
		System.out.println("El Hexaedro tiene "+ (aristas-2)+ " Aristas");
		System.out.println("El Area del Hexaedro es de: "+String.format("%.2f",Area));
		System.out.println("El Volumen del Hexaedro es de: "+String.format("%.2f",Volumen));
		System.out.println("La Diagonal del Hexaedro es de: "+String.format("%.2f", D));
	}

}



