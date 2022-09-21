package cuerpogeometricos;

public class cono {

	public static void main(String[] args) {

		double generatriz, AreaTotal, Volumen, Areabase,perimetrobase,AreaLateral,r ,h;
			
		r=6;
		h=10;

		
		perimetrobase=Math.PI *2* r;

		generatriz=(Math.pow(h, 2)+(Math.pow(r, 2)));
		AreaLateral=(perimetrobase* generatriz)/2;	
Areabase=Math.PI*(Math.pow(r, 2));

		AreaTotal=AreaLateral+Areabase;
		Volumen=(Areabase*h) /3;

		//Datos de Salida
		System.out.println("El radio del Cono es. "+r);
		System.out.println("La altura del cono es: "+h);
		System.out.println("El Perimetro base del cono es: "+String.format("%.2f",perimetrobase));
		System.out.println("El Area lateral del cono es. "+String.format("%.2f",AreaLateral));
		System.out.println("El Area Base del cono es: "+ String.format("%.2f",Areabase));
		System.out.println("El AreaTotal del cono es: "+String.format("%.2f",AreaTotal));
		System.out.println("El Volumen del cono es :"+String.format("%.2f",Volumen));
	}

}

