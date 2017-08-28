- # Problema do Diamante

	 O "Problema" ocorre pois o JAVA não suporta herança multipla por não saber se comportar (Quem chamaria primeiro).
 
## Exemplo:

- Class A{// metodo implantado}
- Class B extends A{ // metodo sobrescrito }  
- Class C  extends A {// metodo sobrescrito}
- *Class D extends B, C {}

Caso existisse uma 4º Classe que quisesse  se estender com os filhos do pai (Class B e Class C) como mostra o exemplo a cima, daria errado por não saber se comportar.

## Como Resolver:

Para resolver, uma solução seria instanciar o método desejado.

  public class D {

    private B b = new B();
    private C c = new C();

    public void quemManda() {
      c.teste();
      b.teste();
    }
  }
