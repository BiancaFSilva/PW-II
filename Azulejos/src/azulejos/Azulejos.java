/* As medidas serão calculadas em metros 
 * 80cm => 0.80m 
 */

package azulejos;
import java.util.Scanner;

public class Azulejos {
    private float largura_piso;
    private float altura_piso;
    private float area_piso;
    private float largura;
    private float altura;
    private float area;
    private float qtde;
    private String tipo;
    
    public void qtde_azulejos() {
        calcula_area_piso();
        calcula_area();
        this.qtde = this.area_piso / this.area;
        System.out.println("Serão utilizados " + this.qtde + " azulejos. ");
    }
    public void calcula_area_piso() {
        System.out.print("Digite da altura da área a ser ocupada pelos azulejos: ");
        Scanner leitura = new Scanner(System.in);
        this.altura_piso = leitura.nextFloat();
        System.out.print("Digite da largura da área a ser ocupada pelos azulejos: ");
        this.largura_piso = leitura.nextFloat();
        this.area_piso = this.altura_piso * this.largura_piso;
        System.out.println("A área a ser utilizada é de " + this.area_piso + "m^2. \r\n");
    }
    public void calcula_area() {
        System.out.println("O azulejo utilizado é quadrado ou retangular? Digite Q para quadrado ou R para retangular: ");
        Scanner leitura = new Scanner(System.in);
        this.tipo = leitura.nextLine();
        this.tipo = this.tipo.toUpperCase();
        switch(tipo) {
            case "Q":
                System.out.print("Digite a medida da largura do azulejo: ");
		this.largura = leitura.nextFloat();
                this.area = this.largura * this.largura;
                System.out.println("A área do azulejo é de " + this.area + "m^2. \r\n");
                break;
            case "R":
                System.out.print("Digite a medida de um dos lados do azulejo: ");
		this.largura = leitura.nextFloat();
                System.out.print("Digite a medida da altura do azulejo: ");
		this.altura = leitura.nextFloat();
                this.area = this.largura * this.altura;
                System.out.println("A área do azulejo é de " + this.area + "m^2. \r\n");
                break;
            default:
                System.out.println("Inválido \r\n");
                break;                
        }
    }
}
