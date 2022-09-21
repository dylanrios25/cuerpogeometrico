package cuerpogeometricos;

public class variable {

	public static void main(String[] args) {
		
		int n;
		float Pbase, h,  longitudLados;
		float areaLateral;
		double  volumen,apotema,  anguloCentral , Abase, areaTotal;
		
		h = 30 ;
		n = 2;
		longitudLados = 4.5f;
		
		Pbase = n * longitudLados;
		areaLateral = Pbase * h;
        
		anguloCentral = (360 / n)*(Math.PI/180);
		Double denominador = Math.tan(anguloCentral/2);
		apotema =longitudLados/(2*denominador);
		Abase = (Pbase * apotema)/2;
		areaTotal = areaLateral + 2 * Abase;

		volumen = Abase * h;
		
		System.out.println("1.Datos del prisma");
		System.out.println("2.Cantidad de lados: " + n);
		System.out.println("3.Longitud de los datos: " + longitudLados);
		System.out.println("4.Altura: " + h);
		System.out.println("5.Perimetro de la base: " + Pbase);
		System.out.println("6.Area de la base: " + String.format("%.2f",Abase));
		System.out.println("Apotema: "  + String.format("%.2f",apotema));
		System.out.println("8.Area Lateral: " + String.format("%.2f",areaLateral));
		System.out.println("9.Area Total: "  + String.format("%.2f",areaTotal));
		System.out.println("10.Volumen: "  + String.format("%.2f",volumen));
			}

}

