import java.util.Scanner;

public class MainFG {
    
    public static void main(String[] args) {
    Scanner fg = new Scanner(System.in);

    System.out.println("Elige la figura Geometrica para calcular el area: ");

    System.out.println("1.Cuadrado");
    System.out.println("2.Triangulo");
    System.out.println("3. Circulo");

    int opcion = fg.nextInt();
    float ladoCuadrado=0, baseTriangulo=0, alturaTriangulo=0, radioCirculo=0;

    switch (opcion) {
        case 1:
            System.out.println("Ingrese el lado del cuadrado: ");
            ladoCuadrado = fg.nextFloat();
            break;
        
        case 2:
            System.out.println("Ingrese la base del trinagulo: ");
            baseTriangulo = fg.nextFloat();
            System.out.println("Ingrese la altura del triangulo");
            alturaTriangulo = fg.nextFloat();
            break;

        case 3:
        System.out.println("Ingrese el radio del circulo");
        radioCirculo = fg.nextFloat();
            break;
    
        default:

            System.out.println("Opcion no valida");
            fg.close();
            return;
    }
    FigurasGeometricas pruebaFigura1 = new FigurasGeometricas(ladoCuadrado, baseTriangulo, alturaTriangulo, radioCirculo, opcion);
    pruebaFigura1.calcularArea();
    fg.close();

    }
    
}
