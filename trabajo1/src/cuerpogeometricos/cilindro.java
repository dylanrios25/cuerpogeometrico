package cuerpogeometricos;


public class cilindro {



		public static void main(String[] args) {

			double  Volumen, Areabase,AreaLateral, Perimetrobase,h ,radio, AreaTotal;

			h=9;
			radio=3;

			Perimetrobase=(2*Math.PI)*radio;
			AreaLateral=Perimetrobase*h;
			Areabase=Math.PI*(2*radio); 
			AreaTotal=AreaLateral+(2*Areabase);
			Volumen=Areabase*h;

			System.out.println(" El perimetro base del Cilindro es: "+ String.format("%.2f",Perimetrobase));
			System.out.println("El Area Lateral del Cilindro es: "+String.format("%.2f",AreaLateral));
			System.out.println("El Area base del Cilindro es: "+ String.format("%.2f",Areabase));
			System.out.println(" El Area Total del Dcilindo es: "+String.format("%.2f",AreaTotal));
			System.out.println("El Volumen del Cilindro es: "+String.format("%.2f",Volumen));
		}

	}


