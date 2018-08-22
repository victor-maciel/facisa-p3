# unifacisa-p3
Destinado as atividades da disciplina de Programação 3 na UNIFACISA. 

## Sumario

- Atividade 01 - Problema do Diamante
- Atividade 02 - Padrão Singleton  
- Atividade 03 - Connection Pool  

===============================================================================

# Atividade 01 - Problema do Diamante

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
  
  ===============================================================================
  
# Atividade 02 - Padrão Singleton 

O padrão Singleton permite criar objetos únicos para os quais há apenas uma instância. Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais. Para entendermos e usarmos bem o padrão de Projeto Singleton é necessário apenas dominar bem as variáveis e métodos de classe estáticos além dos modificadores de acesso.

O Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela. Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela. Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. O Padrão Singleton também oferece um ponto global de acesso a sua instância. A própria classe sempre vai oferecer a própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.

 ===============================================================================
 
# Atividade 03 - Connection Pool
É uma camada que fica entre o cliente de banco de dados, que faz as conexões com o banco, e o próprio banco. Em aplicações Java, o cliente normalmente é um EJB, um Servlet, uma Action Struts, ou uma classe Java qualquer e o banco seria representado por uma conexão com o driver JDBC para algum servidor de banco de dados.

Ele mantém certo número de conexões abertas com o banco de dados. Quando o cliente Java abre uma conexão usando o pool, ao invés de abrir uma nova conexão com o banco usando o driver JDBC, este simplesmente pega uma das conexões que ele já mantinha aberta com o banco e a marca como alocada para aquele cliente Java.

## Vantagens
- Menor tempo de acesso
- Evita de sempre criar novas conexões
- Maior numero de conexões sem precisar ter um numero grande no banco de dados.



