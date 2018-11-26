<h1>Singleton</h1>

<h2>Integrantes do trabalho</h2>
<td><li>Patrick Gonçalves</li>
  <li>Rodrigo Pedrotti</li></td>

<h2><b>Design Patterns</b></h2>
<p>Elementos da programação orientada a objetos, encontrados em várias linguagens de programação como Java, C#, Delphi, 
entre outras, pelo(s) qual(is) nos permite abstrair de maneira mais eficiente e porque não eficaz a recuperação de dados 
através de uma simples codificação própria para cada elemento de um Design Pattern.</p>

<p>O nome vem da lógica que temos que ter "as melhores práticas para resolver problemas conhecidos".</p>

<h2><b>Então o que é o Singleton </b></h2>
<p>Garantir que uma classe tenha somente uma instância e fornece um ponto global de acesso para a mesma.
Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela. 
Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. 
O Padrão Singleton também oferece um ponto global de acesso a sua instância. A própria classe sempre vai oferecer a 
própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.</p>

<h2><b>Entendendo um pouco melhor sobre o padrão</b></h2>

![padraosingleton_java1](https://user-images.githubusercontent.com/34414598/48813997-52483380-ed20-11e8-9f33-f0065e73e4f0.jpg)

<p>Observando a imagem acima verificamos que ela se refereque ela se refere ao diagrama de classe do padrão Singleton, nela tem-se o atributo singleton que é do tipo da sua própria classe e é estático, nessa variável tem-se a única instância da classe. Nos métodos pode-se observar a presença do construtor da classe Singleton() que é PRIVADO. Ou seja, um construtor privado não permite que a classe seja instanciada a não ser que seja feito por ela mesmo na qual será instanciada pelo método getInstance() que é estático e assim pode ser acessado de qualquer outra classe sem precisar instanciar Singleton.</p>

![captura de tela 2018-11-21 as 23 13 10](https://user-images.githubusercontent.com/34414598/49012621-14ed0700-f161-11e8-9b73-75e996df669d.png)

![captura de tela 2018-11-21 as 23 13 23](https://user-images.githubusercontent.com/34414598/49012672-44037880-f161-11e8-9e24-3594003b2407.png)


![captura de tela 2018-11-21 as 23 15 32](https://user-images.githubusercontent.com/34414598/49012718-6dbc9f80-f161-11e8-88fe-70553efc894a.png)

![captura de tela 2018-11-21 as 23 16 02](https://user-images.githubusercontent.com/34414598/49012762-888f1400-f161-11e8-8bd8-491916e916d1.png)
