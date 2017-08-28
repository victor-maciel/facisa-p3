- # Connection Pool
É uma camada que fica entre o cliente de banco de dados, que faz as conexões com o banco, e o próprio banco. Em aplicações Java, o cliente normalmente é um EJB, um Servlet, uma Action Struts, ou uma classe Java qualquer e o banco seria representado por uma conexão com o driver JDBC para algum servidor de banco de dados.

Ele mantém certo número de conexões abertas com o banco de dados. Quando o cliente Java abre uma conexão usando o pool, ao invés de abrir uma nova conexão com o banco usando o driver JDBC, este simplesmente pega uma das conexões que ele já mantinha aberta com o banco e a marca como alocada para aquele cliente Java.

## Vantagens
- Menor tempo de acesso
- Evita de sempre criar novas conexões
- Maior numero de conexões sem precisar ter um numero grande no banco de dados.
