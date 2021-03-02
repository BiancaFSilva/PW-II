/* ÁREA DAS FIGURAS PLANAS
 * 
 * Quadrado  -> a = (lado)^2
 * Retângulo -> a = lado*base
 * Triângulo -> a = (base*altura)/2
 */

package calculodearea;
import java.util.Scanner;

public class Area {
    private float lado;
    private float base;
    private float altura;
    private float area;
    private String tipo;
    
    public void pega_dados() {
        System.out.println("Digite 1 para calcular a área do quadrado, 2 para retângulo e 3 para triângulo: ");
        Scanner leitura = new Scanner(System.in);
        this.tipo = leitura.nextLine();
        calcula_area(this.tipo);
    }
    public void calcula_area(String tipo) {
        if("1".equals(this.tipo)) {
            System.out.println("Digite o valor do lado do quadrado: ");
            Scanner leitura = new Scanner(System.in);
            this.lado = leitura.nextFloat();
            this.area = this.lado * this.lado;
            System.out.println("A área dess quadrado é: " + this.area);
        } else {
            if ("2".equals(this.tipo)) {
                System.out.println("Digite o valor do lado do retângulo: ");
                Scanner leitura = new Scanner(System.in);
                this.lado = leitura.nextFloat();
                System.out.println("Digite o valor da base do do retângulo: ");
                this.base = leitura.nextFloat();
                this.area = this.lado * this.base;
                System.out.println("A área dess retângulo é: " + this.area);
            } else {
                if ("3".equals(this.tipo)) {
                    System.out.println("Digite o valor da base do do triângulo: ");
                    Scanner leitura = new Scanner(System.in);
                    this.base = leitura.nextFloat();
                    System.out.println("Digite o valor do altura do triângulo: ");
                    this.altura = leitura.nextFloat();
                    this.area = (this.altura * this.base)/2;
                    System.out.println("A área dess triângulo é: " + this.area);
                } else {
                    System.out.println("Inválido");
                }
            }
        }
    }
}
