
package arvorebinaria;

/**
 *
 * @author guilh
 */
public class ArvoreBinaria {

    int num;
    ArvoreBinaria noEsquerdo;
    ArvoreBinaria noDireito;
    
    public ArvoreBinaria(int num){
        this.num = num;
    }
    public static ArvoreBinaria raiz;
     
    public static void inserir(int num) {
        inserir(raiz, num);
        
    }
    
    public static void inserir(ArvoreBinaria no, int num){
        if (no == null) {
            raiz = new ArvoreBinaria(num);
            
        } else {
            if (num<no.num){
                if(no.noEsquerdo != null){
                    inserir(no.noEsquerdo, num);
                } else {
                    System.out.println("Inserindo "+num+" a esquerda de "+no.num);
                    no.noEsquerdo = new ArvoreBinaria(num);
                }
            } else {
                if (no.noDireito != null) {
                    inserir(no.noDireito, num);
                    
                } else {
                    System.out.println("Inserindo "+num+" a direita de "+no.num);
                    no.noDireito = new ArvoreBinaria(num);
                }
                
            }
        }
    }
    
    public static void preordem(ArvoreBinaria no) {
        if (no != null) {
            System.out.print(no.num + ", ");
            preordem(no.noEsquerdo);
            preordem(no.noDireito);

        }
    }

    public static void posordem(ArvoreBinaria no) {
        if (no != null) {

            posordem(no.noEsquerdo);
            posordem(no.noDireito);
            System.out.print(no.num + ", ");

        }

    }

    public static void ordem(ArvoreBinaria no) {
        if (no != null) {
            ordem(no.noEsquerdo);
            System.out.print(no.num + ", ");
            ordem(no.noDireito);

        }
    }

    
    public static void main(String[] args) {

        inserir(12);
        inserir(4);
        inserir(15);
        inserir(5);
        inserir(2);
        inserir(20);
        inserir(3);

    }
}
