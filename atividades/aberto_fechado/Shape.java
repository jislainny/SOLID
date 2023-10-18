/*
Neste código, a classe Shape possui um método draw() que verifica o tipo de forma 
(circle, rectangle ou triangle) e chama o método correspondente para desenhar a forma. 
Isso viola o Princípio OCP, pois a classe está aberta para modificação 
sempre que um novo tipo de forma é adicionado.
*/
public interface Shape {
    private String type;

  
    public void draw() 
    }
