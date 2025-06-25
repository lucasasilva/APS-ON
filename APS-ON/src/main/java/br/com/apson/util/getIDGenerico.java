package br.com.apson.util;

public interface getIDGenerico {
    /*Fazemos dessa forma para que possamos declarar essa interface
    nas classes onde precisamos retornar o id gerado.
    Dessa forma, na classe que precisamos retornar o ID, posteriormente,
    forçamos a implementação desta interface (já que 'getId' é um getter padrão de todas as nossas classes)
    e, no nossos genéricos passamos um argumento com o tipo dessa interface, mantendo os dados deste objeto +
    acesso ao méto do "getId"
    * */
    long getId();

    //Boa prática manda que isso aqui fosse uma interface separada, para que coisas que não tenham "nome" como parâmetro
    //ainda possam implementar o outro méto do, mas vai assim mesmo
    String getNome();
}
